import java.util.Scanner;

public class ATVP8 {
    public static void main(String[] args) throws Exception {
       Scanner scanner = new Scanner(System.in);

        System.out.println(" Qual o nome da sua cidade?");
        String cidade = scanner.nextLine();

        System.out.println("Distância  do trajeto KM");
        double distância = scanner.nextDouble();

        System.out.println("Eficiência do carro KM/L");
        double eficiência = scanner.nextDouble();

        System.out.println(" Insira o Preço da Gasolina");
        double gasolina = scanner.nextDouble();

        double custo = distância/eficiência*gasolina;
         System.out.println("Nome da Cidade: " + cidade);
         System.out.println("Custo da Viagem = " + custo);

         scanner.close();


    }
}

