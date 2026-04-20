import java.util.Scanner;

public class Q09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[][] matriz = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matriz[i][j] = sc.nextInt();
            }
        }

        int somaPrincipal = 0;
        int somaSecundaria = 0;

        for (int i = 0; i < n; i++) {
            somaPrincipal += matriz[i][i]; 

            somaSecundaria += matriz[i][n - 1 - i]; 
        }

        int somaTotal = somaPrincipal + somaSecundaria;

        if (n % 2 != 0) {
            int centro = n / 2; 
            somaTotal -= matriz[centro][centro];
        }

        System.out.println("Soma da diagonal principal: " + somaPrincipal); 
        System.out.println("Soma da diagonal secundaria: " + somaSecundaria); 
        System.out.println("Soma total das diagonais sem repetir o centro: " + somaTotal);

        sc.close();
    }
}