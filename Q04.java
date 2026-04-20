import java.util.Scanner;

public class Q04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] codigos = new int[n];

        for (int i = 0; i < n; i++) {
            codigos[i] = sc.nextInt();
        }

        int x = sc.nextInt();
        boolean encontrado = false;
        int posicao = -1;

        for (int i = 0; i < n; i++) {
            if (codigos[i] == x) {
                encontrado = true;
                posicao = i;
                break;
            }
        }
        if (encontrado) {
            System.out.println("Codigo encontrado");
            System.out.println("Primeira posicao: " + posicao);
        } else {
            System.out.println("Codigo nao encontrado");
        }

        sc.close();
    }
}