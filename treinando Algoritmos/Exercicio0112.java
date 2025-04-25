import java.util.Scanner;

public class Exercicio0112 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("tempo gasto na viagem HRS");
          double tempo = scanner.nextDouble();

          System.out.println(" Distância Percorrida");
             double distancia = scanner.nextDouble();

           double vlmedia= distancia/tempo;
           System.out.println("Velocidade Média: " + vlmedia + " km/h");

           scanner.close();


    }
}
