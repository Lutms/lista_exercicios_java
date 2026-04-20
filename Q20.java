import java.util.Scanner;

public class Q20 {
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

        int k = sc.nextInt(); 
        int maxComprimento = 0;
        int maxLinha = -1;
        int maxInicio = -1;
        int maxFim = -1;

        for (int i = 0; i < l; i++) {
            int compAtual = 0;
            int inicioAtual = -1;

            for (int j = 0; j < c; j++) {
                if (matriz[i][j] > k) {
                    if (compAtual == 0) {
                        inicioAtual = j;
                    }
                    compAtual++;
                } else {
                    if (compAtual > maxComprimento) {
                        maxComprimento = compAtual;
                        maxLinha = i;
                        maxInicio = inicioAtual;
                        maxFim = j - 1; 
                    }
                    compAtual = 0; 
                }
            }
            
            if (compAtual > maxComprimento) {
                maxComprimento = compAtual;
                maxLinha = i;
                maxInicio = inicioAtual;
                maxFim = c - 1; 
            }
        }

        System.out.println("Maior sequencia acima de " + k + ": " + maxComprimento);
        System.out.println("Linha da sequencia: " + maxLinha);
        System.out.println("Indice inicial: " + maxInicio);
        System.out.println("Indice final: " + maxFim);

        sc.close();
    }
}