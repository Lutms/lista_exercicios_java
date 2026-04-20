import java.util.Scanner;

public class Q08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int l = sc.nextInt(); 
        int c = sc.nextInt();
        double[][] notas = new double[l][c];

        for (int i = 0; i < l; i++) {
            for (int j = 0; j < c; j++) {
                notas[i][j] = sc.nextDouble();
            }
        }

        int aprovados = 0;

        for (int i = 0; i < l; i++) {
            double somaAluno = 0;
            for (int j = 0; j < c; j++) {
                somaAluno += notas[i][j];
            }
            double mediaAluno = somaAluno / c;
            System.out.println("Media do aluno " + i + ":\n" + String.format("%.2f", mediaAluno));

            if (mediaAluno >= 7.0) {
                aprovados++;
            }
        }

        for (int j = 0; j < c; j++) {
            double somaAvaliacao = 0;
            for (int i = 0; i < l; i++) {
                somaAvaliacao += notas[i][j];
            }
            double mediaAvaliacao = somaAvaliacao / l;
            System.out.println("Media da avaliacao " + j + ": " + String.format("%.2f", mediaAvaliacao));
        }

        System.out.println("Quantidade de alunos aprovados: " + aprovados);
        sc.close();
    }
}