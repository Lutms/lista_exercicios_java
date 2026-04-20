import java.util.Scanner;

public class Q11 {
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

        System.out.println("Matriz transposta:");
        
        for (int j = 0; j < c; j++) {
            for (int i = 0; i < l; i++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println(); 
        }

        sc.close();
    }
}