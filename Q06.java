import java.util.Scanner;
import java.util.Arrays;

public class Q06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        double[] tempos = new double[n];

        for (int i = 0; i < n; i++) {
            tempos[i] = sc.nextDouble();
        }

        double[] temposOrdenados = Arrays.copyOf(tempos, n);
        Arrays.sort(temposOrdenados); 
        System.out.println("Melhor tempo: " + temposOrdenados[0]);
        System.out.println("Pior tempo: " + temposOrdenados[n - 1]);       
        System.out.println("Tres melhores tempos:");
        System.out.println(temposOrdenados[0] + " " + temposOrdenados[1] + " " + temposOrdenados[2]);
        sc.close();
    }
}