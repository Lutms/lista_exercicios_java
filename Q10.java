import java.util.Scanner;

public class Q10 {
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

        int maiorSomaLinha = 0, indiceMaiorLinha = 0;

        for (int i = 0; i < l; i++) {
            int somaLinha = 0;
            for (int j = 0; j < c; j++) {
                somaLinha += matriz[i][j];
            }
            System.out.println("Soma da linha " + i + ": " + somaLinha);
            
            if (i == 0 || somaLinha > maiorSomaLinha) {
                maiorSomaLinha = somaLinha;
                indiceMaiorLinha = i;
            }
        }

        int maiorSomaColuna = 0, indiceMaiorColuna = 0;

        for (int j = 0; j < c; j++) {
            int somaColuna = 0;
            for (int i = 0; i < l; i++) {
                somaColuna += matriz[i][j];
            }
            System.out.println("Soma da coluna " + j + ": " + somaColuna);
            
            // Registra a maior coluna
            if (j == 0 || somaColuna > maiorSomaColuna) {
                maiorSomaColuna = somaColuna;
                indiceMaiorColuna = j;
            }
        }

        System.out.println("Linha com maior soma: " + indiceMaiorLinha);
        System.out.println("Coluna com maior soma: " + indiceMaiorColuna);

        sc.close();
    }
}