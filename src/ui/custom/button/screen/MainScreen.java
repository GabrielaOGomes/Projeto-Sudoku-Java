package ui.custom.button.scream;

import Service.BoardService;

import javax.swing.*;
import java.awt.*;
import java.util.Map;

public class MainScream {

    private final static Dimension dimendion = new Dimension(600, 600);

    private final BoardService boardService;

    private JButton finishGameButton;
    private JButton resetButton;
    private JButton checkGameStatusButton;

    public MainScream(final Map<String, String> gameConfig){
       this.boardService = new BoardService(gameConfig);
    }

    public void buildMainScreen
}
