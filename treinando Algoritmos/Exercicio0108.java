import java.util.Scanner;

public class Exercicio0108 {
    public static void main(String[] args) throws Exception {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Nome da Cidade: ");
        String cidade =  entrada.nextLine();

        System.out.println(" Distancia trajeto KM");
        double ds = entrada.nextDouble();

        System.out.println("Eficiência do carro MPG");
        double ef = entrada.nextDouble();

        System.out.println("valor do litro de gasolina R$");
        double gs = entrada.nextDouble();

        double litros = ef*0.425;
        double custo = ds/litros*gs;

        System.out.println("cidade: " + cidade);
        System.out.println("Custo da Viagem: " + custo);

        entrada.close();











    }
}
