import java.util.Scanner;

public class Q12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int l = sc.nextInt();
        int c = sc.nextInt();
        int[][] matrizOriginal = new int[l][c];

        for (int i = 0; i < l; i++) {
            for (int j = 0; j < c; j++) {
                matrizOriginal[i][j] = sc.nextInt();
            }
        }

        int r = sc.nextInt(); 
        int s = sc.nextInt(); 

        if (l * c != r * s) {
            System.out.println("Reorganizacao impossivel");
        } else {
            System.out.println("Matriz reorganizada:");
            
            int[] vetorAuxiliar = new int[l * c];
            int posicaoVetor = 0;
            
            for (int i = 0; i < l; i++) {
                for (int j = 0; j < c; j++) {
                    vetorAuxiliar[posicaoVetor] = matrizOriginal[i][j];
                    posicaoVetor++;
                }
            }
            
            posicaoVetor = 0; 
            int[][] matrizNova = new int[r][s];
            
            for (int i = 0; i < r; i++) {
                for (int j = 0; j < s; j++) {
                    matrizNova[i][j] = vetorAuxiliar[posicaoVetor];
                    System.out.print(matrizNova[i][j] + " ");
                    posicaoVetor++;
                }
                System.out.println();
            }
        }

        sc.close();
    }
}