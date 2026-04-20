import java.util.Scanner;

public class Q02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        double[] notas = new double[n];
        double soma = 0;

        for (int i = 0; i < n; i++) {
            notas[i] = sc.nextDouble();
            soma += notas[i];
        }

        double maior = notas[0];
        double menor = notas[0];
        int aprovados = 0;

        for (int i = 0; i < n; i++) {
            if (notas[i] > maior) maior = notas[i];
            if (notas[i] < menor) menor = notas[i];
            if (notas[i] >= 7.0) aprovados++;
        }

        System.out.println("Maior nota: " + maior);
        System.out.println("Menor nota: " + menor);
        System.out.println("Media da turma: " + String.format("%.2f", (soma/n)));
        System.out.println("Quantidade de aprovados: " + aprovados);
        
        sc.close();
    }
}