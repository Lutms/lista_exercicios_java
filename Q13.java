import java.util.Scanner;

public class Q13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int l = sc.nextInt();
        int c = sc.nextInt();
        int[][] matriz = new int[l][c];
        
        int soma = 0;

        for (int i = 0; i < l; i++) {
            for (int j = 0; j < c; j++) {
                matriz[i][j] = sc.nextInt();
                soma += matriz[i][j];
            }
        }

        int k = sc.nextInt();

        double media = (double) soma / (l * c); 
        int maior = matriz[0][0]; 
        int acimaDeK = 0;

        for (int i = 0; i < l; i++) {
            for (int j = 0; j < c; j++) {
                if (matriz[i][j] > maior) {
                    maior = matriz[i][j];
                }
                if (matriz[i][j] > k) {
                    acimaDeK++;
                }
            }
        }

        System.out.println("Media dos elementos: " + String.format("%.2f", media).replace(",", "."));
        System.out.println("Maior elemento: " + maior);
        System.out.println("Quantidade acima de " + k + ": " + acimaDeK);

        sc.close();
    }
}