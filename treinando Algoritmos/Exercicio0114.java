import java.util.Scanner;

public class Exercicio0114 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Valor em Reais");
        double valor = scanner.nextDouble();

        System.out.println("Cotação Dolar");
        double dolar =  scanner.nextDouble();
        double conversao = valor/dolar;

        System.out.printf("Dólares: " + conversao);

        scanner.close();





    }
}
