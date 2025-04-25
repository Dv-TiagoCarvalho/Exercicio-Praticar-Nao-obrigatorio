import java.util.Scanner;

public class ATVP3 {
    public static void main(String[] args) throws Exception {
       Scanner scanner = new Scanner(System.in);

        System.out.println("Escreva o nome 1:");
        String nome1 = scanner.nextLine();
        System.out.println("Escreva o nome 2:");
        String nome2 = scanner.nextLine();

       System.out.println("Nome 1: " + nome1);
       System.out.println("Nome 2: "+ nome2);

      scanner.close();



    }
}

