import java.util.Scanner;

public class Exercicio0110 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println(" Quilometragem 1: ");
        double qm1 = scanner.nextDouble();

        System.out.println(" Quilometragem : ");
        double qm2 = scanner.nextDouble(); 

        double conta = Math.abs(qm1-qm2);
        System.out.println("A distância entre os dois pontos é de: "+ conta + " KM");

         scanner.close();
        

        








    }
}
