import java.util.Scanner;

public class Q03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        double[] precos = new double[n];
        for (int i = 0; i < n; i++) precos[i] = sc.nextDouble();

        int p = sc.nextInt();
        double totalAntes = 0, totalDepois = 0;

        System.out.println("Novos precos:");
        for (int i = 0; i < n; i++) {
            totalAntes += precos[i];
            double novoPreco = precos[i] * (1 + p / 100.0);
            totalDepois += novoPreco;
            System.out.print(String.format("%.2f ", novoPreco));
        }

        System.out.println("\nTotal antes do reajuste: " + String.format("%.2f", totalAntes));
        System.out.println("Total depois do reajuste: " + String.format("%.2f", totalDepois));
        
        sc.close();
    }
}