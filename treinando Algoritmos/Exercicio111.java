import java.util.Scanner;

public class Exercicio111 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escreva uma temperatura em Celsius");
        double celsius = scanner.nextDouble();

        double conversao = celsius*1.8 + 32;
        System.out.println("A temperatura em Fahrenheit é: " + conversao);

        scanner.close();

    }
}
