package Service;

import model.Board;
import model.GameStatusEnum;
import model.Space;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class BoardService {

    private final static int BOARD_LIMIT = 9;

    private final Board board;

    public BoardService(final Map<String, String> gameConfig) {
        this.board = new Board(initBoard(gameConfig));
    }

    public List<List<Space>> getSpaces() {
        return board.getSpaces();
    }

    public void reset() {
        board.reset();
    }

    public boolean hasErrors() {
        return board.hasErrors();
    }

    public GameStatusEnum getStatus() {
        return board.getStatus();
    }

    public boolean gameIsFinished() {
        return board.gameIsFinished();
    }

    private List<List<Space>> initBoard(final Map<String, String> gameConfig) {
        List<List<Space>> spaces = new ArrayList<>();
        for (int i = 0; i < BOARD_LIMIT; i++) {
            spaces.add(new ArrayList<>());
            for (int j = 0; j < BOARD_LIMIT; j++) {
                String key = "%s,%s".formatted(i, j);
                var positionConfig = gameConfig.get(key);

                if (positionConfig == null) {
                    throw new IllegalArgumentException("Configuração ausente para a posição: " + key);
                }

                var configParts = positionConfig.split(","); // ← sem espaço
                int expected = Integer.parseInt(configParts[0].trim());
                boolean fixed = Boolean.parseBoolean(configParts[1].trim());

                var currentSpace = new Space(expected, fixed);
                spaces.get(i).add(currentSpace);
            }
        }
        return spaces;

    }
}