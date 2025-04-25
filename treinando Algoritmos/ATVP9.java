import java.util.Scanner;

public class ATVP9 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual sua Altura?");
        double alt= scanner.nextDouble();

        System.out.println("Qual o seu  Peso?");
        double ps = scanner.nextDouble();

        double ctv1 = alt*alt;
        double IMC = ps/ctv1;
        System.out.println("IMC = " + IMC);

        scanner.close();




    }
}
