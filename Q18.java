import java.util.Scanner;

public class Q18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int l = sc.nextInt();
        int c = sc.nextInt();
        int[][] matriz = new int[l][c];

        for (int i = 0; i < l; i++) {
            for (int j = 0; j < c; j++) {
                matriz[i][j] = sc.nextInt();
            }
        }

        int qtdPicos = 0;
        int valorMaiorPico = Integer.MIN_VALUE;
        int posI = -1, posJ = -1;

        for (int i = 0; i < l; i++) {
            for (int j = 0; j < c; j++) {
                boolean ePico = true;

                if (i > 0 && matriz[i][j] <= matriz[i - 1][j]) ePico = false;     
                if (i < l - 1 && matriz[i][j] <= matriz[i + 1][j]) ePico = false;  
                if (j > 0 && matriz[i][j] <= matriz[i][j - 1]) ePico = false;      
                if (j < c - 1 && matriz[i][j] <= matriz[i][j + 1]) ePico = false; 

                if (ePico) {
                    qtdPicos++;
                    if (qtdPicos == 1 || matriz[i][j] > valorMaiorPico) {
                        valorMaiorPico = matriz[i][j];
                        posI = i;
                        posJ = j;
                    }
                }
            }
        }

        System.out.println("Quantidade de pontos de pico: " + qtdPicos);
        System.out.println("Posicao do maior ponto de pico: " + posI + " " + posJ);
        System.out.println("Valor do maior ponto de pico: " + valorMaiorPico);

        sc.close();
    }
}