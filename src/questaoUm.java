import java.util.Scanner;

public class questaoUm {
    public static void main(String[] args) {
        double consumoMedio = 12.0;
        double distanciaTotal = 360.0;

        double litrosNecessarios = distanciaTotal / consumoMedio;

        Scanner entradaUsuario = new Scanner(System.in);
        System.out.print("Digite o valor do litro da gasolina separando por vírgula no formato real,centavos (ex: 5,49): ");
        double precoGasolina = entradaUsuario.nextDouble();

        double custoTotal = litrosNecessarios * precoGasolina;

        System.out.printf("Litros necessários: %.2f litros%n", litrosNecessarios);
        System.out.printf("Custo total da viagem: R$ %.2f%n", custoTotal);

        entradaUsuario.close();

    }
}
