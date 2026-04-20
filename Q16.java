import java.util.Scanner;

public class Q16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[][] matriz = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matriz[i][j] = sc.nextInt();
            }
        }

        int maiorDiferenca = -1;
        int terminalMaiorDiferenca = -1;

        for (int i = 0; i < n; i++) {
            int saidas = 0;
            int chegadas = 0;

            for (int j = 0; j < n; j++) {
                saidas += matriz[i][j];   
                chegadas += matriz[j][i]; 
            }

            System.out.println("Saidas do terminal " + i + ": " + saidas);
            System.out.println("Chegadas no terminal " + i + ": " + chegadas);

            int diferencaAtual = Math.abs(saidas - chegadas);
            if (diferencaAtual > maiorDiferenca) {
                maiorDiferenca = diferencaAtual;
                terminalMaiorDiferenca = i;
            }
        }

        boolean simetrica = true;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (matriz[i][j] != matriz[j][i]) {
                    simetrica = false;
                    break;
                }
            }
        }

        System.out.println("Terminal com maior diferenca absoluta entre saidas e chegadas: " + terminalMaiorDiferenca);
        System.out.println("Matriz simetrica: " + (simetrica ? "sim" : "nao"));

        sc.close();
    }
}