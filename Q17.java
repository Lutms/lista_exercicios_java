import java.util.Scanner;

public class Q17 {
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

        int maxGeralLinha = Integer.MIN_VALUE;
        int linhaMax = -1;

        for (int i = 0; i < l; i++) {
            int maxAtual = matriz[i][0];
            int maxGlobalDaLinha = matriz[i][0];

            for (int j = 1; j < c; j++) {
                maxAtual = Math.max(matriz[i][j], maxAtual + matriz[i][j]);
                if (maxAtual > maxGlobalDaLinha) maxGlobalDaLinha = maxAtual;
            }

            if (maxGlobalDaLinha > maxGeralLinha) {
                maxGeralLinha = maxGlobalDaLinha;
                linhaMax = i;
            }
        }

        int maxGeralColuna = Integer.MIN_VALUE;
        int colunaMax = -1;

        for (int j = 0; j < c; j++) {
            int maxAtual = matriz[0][j];
            int maxGlobalDaColuna = matriz[0][j];

            for (int i = 1; i < l; i++) {
                maxAtual = Math.max(matriz[i][j], maxAtual + matriz[i][j]);
                if (maxAtual > maxGlobalDaColuna) maxGlobalDaColuna = maxAtual;
            }

            if (maxGlobalDaColuna > maxGeralColuna) {
                maxGeralColuna = maxGlobalDaColuna;
                colunaMax = j;
            }
        }

        System.out.println("Maior soma contigua em linha: " + maxGeralLinha);
        System.out.println("Linha da maior soma contigua: " + linhaMax);
        System.out.println("Maior soma contigua em coluna: " + maxGeralColuna);
        System.out.println("Coluna da maior soma contigua: " + colunaMax);

        sc.close();
    }
}