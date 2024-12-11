import java.util.Scanner;

public class questaoDois {
    public static void main(String[] args) {
        Scanner entradaUsuario = new Scanner(System.in);
        System.out.print("Digite a quantidade de alunos: ");
        int quantidadeAlunos = entradaUsuario.nextInt();
        entradaUsuario.nextLine();

        String[] nomes = new String[quantidadeAlunos];
        double[] notas = new double[quantidadeAlunos];
        double somaNotas = 0.0;

        for (int i = 0; i < quantidadeAlunos; i++) {
            System.out.print("Digite o nome do aluno " + (i + 1) + ": ");
            nomes[i] = entradaUsuario.nextLine();

            System.out.print("Digite a nota do aluno " + (i + 1) + ": ");
            notas[i] = entradaUsuario.nextDouble();
            entradaUsuario.nextLine();

            somaNotas += notas[i];
        }

        double mediaNotas = somaNotas / quantidadeAlunos;

            System.out.println("Alunos com nota acima da média: ");
            for (int i = 0; i < quantidadeAlunos; i++) {
            if (notas[i] > mediaNotas) {
                System.out.println("Aluno: " + nomes[i] + ", Nota: " + notas[i]);
            }
        }

            entradaUsuario.close();
    }
}