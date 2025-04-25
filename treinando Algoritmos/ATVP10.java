import java.util.Scanner;

public class ATVP10 {
    public static void main(String[] args) throws Exception {
       Scanner scanner = new Scanner(System.in);

        System.out.println("Quilometragem 1 ");
        double qm1 = scanner.nextDouble();

        System.out.println("Quilometragem 2 ");
        double qm2 = scanner.nextDouble();

        double resultado = Math.abs(qm1-qm2);
        System.out.println("Distância = " + resultado + " KM");

        scanner.close();



    }
}