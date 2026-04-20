import java.util.Scanner;

public class Q14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int l = sc.nextInt();
        int c = sc.nextInt();
        int[][] matriz = new int[l][c];
        int somaTotal = 0;

        for (int i = 0; i < l; i++) {
            for (int j = 0; j < c; j++) {
                matriz[i][j] = sc.nextInt();
                somaTotal += matriz[i][j];
            }
        }

        int maiorSomaLinha = 0, indiceMaiorLinha = 0;
        for (int i = 0; i < l; i++) {
            int somaLinha = 0;
            for (int j = 0; j < c; j++) {
                somaLinha += matriz[i][j];
            }
            if (i == 0 || somaLinha > maiorSomaLinha) {
                maiorSomaLinha = somaLinha;
                indiceMaiorLinha = i;
            }
        }

        int menorSomaColuna = 0, indiceMenorColuna = 0;
        for (int j = 0; j < c; j++) {
            int somaColuna = 0;
            for (int i = 0; i < l; i++) {
                somaColuna += matriz[i][j];
            }
            if (j == 0 || somaColuna < menorSomaColuna) {
                menorSomaColuna = somaColuna;
                indiceMenorColuna = j;
            }
        }

        double mediaGeral = (double) somaTotal / (l * c);
        int acimaDaMedia = 0;
        for (int i = 0; i < l; i++) {
            for (int j = 0; j < c; j++) {
                if (matriz[i][j] > mediaGeral) {
                    acimaDaMedia++;
                }
            }
        }

        System.out.println("Linha com maior soma: " + indiceMaiorLinha);
        System.out.println("Coluna com menor soma: " + indiceMenorColuna);
        System.out.println("Media geral: " + String.format("%.2f", mediaGeral).replace(",", "."));
        System.out.println("Quantidade acima da media: " + acimaDaMedia);

        sc.close();
    }
}