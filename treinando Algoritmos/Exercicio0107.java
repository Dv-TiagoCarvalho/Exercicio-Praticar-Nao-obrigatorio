import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
       Scanner scanner = new Scanner(System.in);

        System.out.println("Nome 1:");
        String nome1 = scanner.nextLine();

        System.out.println("Idade 1: ");
        int id1 = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Nome 2:");
        String nome2 = scanner.nextLine();

        System.out.println("Idade 2: ");
        int id2 = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Nome 3:");
        String nome3 = scanner.nextLine();

        System.out.println("Idade 3: ");
        int id3 = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Nome 4:");
        String nome4 = scanner.nextLine();

        System.out.println("Idade 4: ");
        int id4 = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Nome 5:");
        String nome5 = scanner.nextLine();

        System.out.println("Idade 5: ");
        int id5 = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Nome6 :");
        String nome6 = scanner.nextLine();

        System.out.println("Idade 6: ");
        int id6 = scanner.nextInt();
        scanner.nextLine();


        int soma = id1+id2+id3+id4+id5+id6;
        double média = soma/6;
        System.out.println( nome1+ ": " + id1);
        System.out.println( nome2+ ": " + id2);
        System.out.println( nome3+ ": " + id3);
        System.out.println( nome4+ ": " + id4);
        System.out.println( nome5+ ": " + id5);
        System.out.println( nome6+ ": " + id6);
        System.out.println("Soma das Idades: " + soma);
        System.out.println("Média das Idades: " + média);
        scanner.close();






    }   
}
