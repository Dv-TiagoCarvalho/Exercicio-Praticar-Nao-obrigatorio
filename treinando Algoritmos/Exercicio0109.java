import java.util.Scanner;

public class Exercicio0109 {
    public static void main(String[] args) throws Exception {
        Scanner scanner= new Scanner(System.in);


        System.out.println("Informe a  sua Altura");
        double altura = scanner.nextDouble();

        System.out.println("Informe o seu Peso");
        double peso = scanner.nextDouble();

        
         double IMC= peso/(altura*altura);
         System.out.println("IMC = " + IMC );

         scanner.close();










    }
}
