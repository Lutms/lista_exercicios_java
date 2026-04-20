import java.util.Scanner;

public class Q19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[][] matriz = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matriz[i][j] = sc.nextInt();
            }
        }

        int somaReferencia = 0;
        for (int j = 0; j < n; j++) {
            somaReferencia += matriz[0][j];
        }

        int falhas = 0;

        for (int i = 0; i < n; i++) {
            int somaLinha = 0;
            for (int j = 0; j < n; j++) {
                somaLinha += matriz[i][j];
            }
            if (somaLinha != somaReferencia) falhas++;
        }

        for (int j = 0; j < n; j++) {
            int somaColuna = 0;
            for (int i = 0; i < n; i++) {
                somaColuna += matriz[i][j];
            }
            if (somaColuna != somaReferencia) falhas++;
        }

        int somaDiagonalPrincipal = 0;
        int somaDiagonalSecundaria = 0;
        for (int i = 0; i < n; i++) {
            somaDiagonalPrincipal += matriz[i][i];
            somaDiagonalSecundaria += matriz[i][n - 1 - i];
        }

        if (somaDiagonalPrincipal != somaReferencia) falhas++;
        if (somaDiagonalSecundaria != somaReferencia) falhas++;

        if (falhas == 0) {
            System.out.println("Matriz consistente: sim");
            System.out.println("Valor comum das somas: " + somaReferencia);
        } else {
            System.out.println("Matriz consistente: nao");
            System.out.println("Quantidade de estruturas com soma diferente da primeira linha: " + falhas);
        }

        sc.close();
    }
}