import java.util.Scanner;

public class ATVP5 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nome 1:");
        String nome1 = scanner.nextLine();

        System.out.println("Idade 1:");
        int idade1 = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Nome 2:");
        String nome2 = scanner.nextLine();

        System.out.println("Idade 2:");
        int idade2 = scanner.nextInt();

        System.out.println("Nome 1:" + nome1 + "    Idade 1: " + idade1);
        System.out.println("Nome 2:" + nome2 + "   Idade 2: " + idade2);

        scanner.close();




    }
}

