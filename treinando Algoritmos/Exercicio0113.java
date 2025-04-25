import java.util.Scanner;

public class Exercicio0113 {
    public static void main(String[] args) throws Exception {
       Scanner scanner = new Scanner(System.in);
        System.out.println("Escreva a latitude");
        double latitudep1 = Math.toRadians(scanner.nextDouble());

        System.out.println("Escreva a longitude");
        double longitudep1 = Math.toRadians(scanner.nextDouble());

        System.out.println("Escreva a latitude");
        double latitudep2 = Math.toRadians(scanner.nextDouble());

        System.out.println("Escreva a longitude");
        double longitudep2 = Math.toRadians(scanner.nextDouble());

        double raioTerra = 6371; 
        double deltalon = longitudep2 - longitudep1;
        double deltalat = latitudep2 - latitudep1;

        double a = Math.pow(Math.sin(deltalat / 2), 2) + Math.cos(latitudep1) * Math.cos(latitudep2) * Math.pow(Math.sin(deltalon / 2), 2);
        double c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1 - a));

        double distancia = raioTerra * c;

        System.out.println("A distância entre os pontos é de: "+ distancia + " km");

         scanner.close();





    }
}
