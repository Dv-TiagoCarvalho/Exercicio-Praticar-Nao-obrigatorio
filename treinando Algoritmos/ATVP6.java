import java.util.Scanner;

public class ATVP6 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Numero 1:");
        int num1 = scanner.nextInt();

        System.out.println("Numero 2: ");
        int num2 = scanner.nextInt();

        System.out.println("Numero 3:");
        int num3 = scanner.nextInt();

        System.out.println("Numero 4: ");
        int num4 = scanner.nextInt();

         int soma1 = num1+num2;
         int soma2 = num3+num4;

        System.out.println("Soma 1: " + soma1);
        System.out.println("Soma 2: "+ soma2);

        scanner.close();



    }
}

