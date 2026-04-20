import java.util.Scanner;

public class Q01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] consumos = new int[n];
        int total = 0;

        for (int i = 0; i < n; i++) {
            consumos[i] = sc.nextInt();
            total += consumos[i];
        }

        double media = (double) total / n; 
        int diasAcimaMedia = 0;

    
        for (int i = 0; i < n; i++) {
            if (consumos[i] > media) {
                diasAcimaMedia++;
            }
        }

        System.out.println("Consumo total: " + total);
        System.out.println("Consumo medio: " + String.format("%.2f", media));
        System.out.println("Dias acima da media: " + diasAcimaMedia);
        
        sc.close();
    }
}