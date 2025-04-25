import java.util.Scanner;

public class ATVP7 {
    public static void main(String[] args) throws Exception {
      Scanner scanner = new Scanner(System.in);

       System.out.println("Escreva o nome 1:");
       String nome1 = scanner.nextLine();

       System.out.println("Escreva o nome 2:");
       String nome2 = scanner.nextLine();

       System.out.println("Escreva o nome 3:");
       String nome3= scanner.nextLine();

       System.out.println("Escreva o nome 4:");
       String nome4 = scanner.nextLine();

       System.out.println("Escreva o nome 5:");
       String nome5 = scanner.nextLine();

       System.out.println("Escreva o nome 6:");
       String nome6 = scanner.nextLine();

       System.out.println("Escreva a Idade 1:");
       int n1 = scanner.nextInt();
       
       System.out.println("Escreva a Idade 2:");
       int n2 = scanner.nextInt();

       System.out.println("Escreva a Idade 3:");
       int n3= scanner.nextInt();

       System.out.println("Escreva a Idade 4:");
       int n4 = scanner.nextInt();

       System.out.println("Escreva a Idade 5:");
       int n5 = scanner.nextInt();

       System.out.println("Escreva a Idade 6:");
       int n6 = scanner.nextInt();

        System.out.println("Nome 1:" + nome1 +  "  Idade 1:" + n1);
        System.out.println("Nome 2:" + nome2 +  "  Idade 2:" + n2);
        System.out.println("Nome 3:" + nome3 +  "  Idade 3:" + n3);
        System.out.println("Nome 4:" + nome4 +  "  Idade 4:" + n4);
        System.out.println("Nome 5:" + nome5 +  "  Idade 5:" + n5);
        System.out.println("Nome 6:" + nome6 +  "  Idade 6:" + n6);

        int somatotal = n1 + n2 + n3 + n4+ n5 + n6;
        System.out.println("Soma Total = "+ somatotal);
        double media = somatotal/6;
        System.out.println("Média = " + media);

        scanner.close();

    

       
       
       
       
       
       



    }


}
