package Service;
import java.util.HashMap;
import java.util.Map;


    public class TesteBoard {

        public static void main(String[] args) {
            Map<String, String> gameConfig = new HashMap<>();

            for (int i = 0; i < 9; i++) {
                for (int j = 0; j < 9; j++) {
                    // exemplo: fixa alguns valores em posições específicas
                    if ((i == 0 && j == 0) || (i == 1 && j == 1) || (i == 2 && j == 2)) {
                        gameConfig.put(i + "," + j, "5,true"); // célula com valor fixo
                    } else {
                        gameConfig.put(i + "," + j, "0,false"); // célula editável com valor 0
                    }
                }
            }

            // Imprime exemplo do mapa
            gameConfig.forEach((k, v) -> System.out.println(k + " => " + v));
        }
    }
