import java.util.Scanner;

public class questaoQuatro {
    public static void main(String[] args) {
        Scanner entradaUsuario = new Scanner(System.in);

        System.out.println("Digite um número inteiro: ");
        int numero = entradaUsuario.nextInt();

        if (numero < 2) {
            System.out.println("O número não é primo.");
        } else {
            boolean ePrimo = true;
            for (int i = 2; i < numero; i++) {
                if (numero % i == 0) {
                    ePrimo = false;
                    break;
                }
            }
            if (ePrimo) {
                System.out.println("O número é primo.");
            } else {
                System.out.println("O número não é primo.");
            }
        }
    }
}
