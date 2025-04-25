import java.util.Scanner;

public class ATVP4 {
    public static void main(String[] args) throws Exception {
       Scanner scanner = new Scanner(System.in);

        System.out.println("Escreva Nome 1: ");
        String nome1 = scanner.nextLine();

        System.out.println("Escreva Nome 2: ");
        String nome2 = scanner.nextLine();

        System.out.println("Escreva a Idade 1: ");
        int id1 = scanner.nextInt();

        System.out.println("Escreva a Idade 2: ");
        int id2 = scanner.nextInt();

        System.out.println("Nome 1:" + nome1 + "  Idade 1: " + id1);
        System.out.println("Nome 2:"+ nome2 + "  Idade 2: " + id2);

        scanner.close();

    

    }
}
