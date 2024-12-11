import java.util.Scanner;

public class questaoTres {
    public static void main(String[] args) {
        Scanner entradaUsuario = new Scanner(System.in);

        System.out.println("Digite o número de membros de sua família: ");
        int familia = entradaUsuario.nextInt();
        entradaUsuario.nextLine();

        System.out.println("Digite o número de fatias de pizza: ");
        int fatias = entradaUsuario.nextInt();
        entradaUsuario.nextLine();

        int fatiasPorMembro = fatias / familia;
        int sobras = fatias % familia;

        if (sobras != 0) {
            System.out.println("Sobrarão " + sobras + " fatias.");
            int fatiasFaltando = familia - sobras;
            System.out.println("Faltam " + fatiasFaltando + " fatias para que todos tenham o mesmo número.");
        } else {
            System.out.println("Não haverá sobra. Todos terão " + fatiasPorMembro + " fatias.");
        }
    }
}
