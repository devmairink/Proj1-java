import java.util.Scanner;

public class ConversorTemperatura {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 

        System.out.println("Escolha a conversão: \n1. Celsius para Fahrenheit\n2. Fahrenheit para Celsius");
        int escolha = scanner.nextInt();

        double temperatura;

        if (escolha == 1) {
            System.out.println("Digite a temperatura em Celsius:");
            temperatura = scanner.nextDouble();
            double resultado = (temperatura * 9 / 5) + 32;
            System.out.println("Temperatura em Fahrenheit: " + resultado);
        } else if (escolha == 2) {
            System.out.println("Digite a temperatura em Fahrenheit:");
            temperatura = scanner.nextDouble();
            double resultado = (temperatura - 32) * 5 / 9;
            System.out.println("Temperatura em Celsius: " + resultado);
        } else {
            System.out.println("Opção inválida.");
        }
    }
}
