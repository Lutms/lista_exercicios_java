import java.util.Scanner;

public class Q15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[][] matriz = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matriz[i][j] = sc.nextInt();
            }
        }

        boolean diagonalComZeros = true;
        int maiorForaDiagonal = -1; 
        int indiceI = -1, indiceJ = -1;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j) {
                    if (matriz[i][j] != 0) {
                        diagonalComZeros = false;
                    }
                } 
                else {
                    if (maiorForaDiagonal == -1 || matriz[i][j] > maiorForaDiagonal) {
                        maiorForaDiagonal = matriz[i][j];
                        indiceI = i;
                        indiceJ = j;
                    }
                }
            }
        }

        int menorSomaLinha = 0, indiceMenorLinha = 0;
        for (int i = 0; i < n; i++) {
            int somaLinha = 0;
            for (int j = 0; j < n; j++) {
                somaLinha += matriz[i][j];
            }
            if (i == 0 || somaLinha < menorSomaLinha) {
                menorSomaLinha = somaLinha;
                indiceMenorLinha = i;
            }
        }

        System.out.println("Diagonal principal com zeros: " + (diagonalComZeros ? "sim" : "nao"));
        System.out.println("Maior valor fora da diagonal: " + maiorForaDiagonal + " (" + indiceI + "," + indiceJ + ")");
        System.out.println("Linha com menor soma: " + indiceMenorLinha);

        sc.close();
    }
}