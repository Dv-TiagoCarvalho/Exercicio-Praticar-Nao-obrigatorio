import java.util.Scanner;

public class Exercicio0115 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Largura");
        double lr = scanner.nextDouble();

        System.out.println("Comprimento");
        double cp = scanner.nextDouble();

        System.out.println("Altura");
        double alt = scanner.nextDouble();

        System.out.println(" área total das portas ");
        double area = scanner.nextDouble();

        System.out.println(" área total das janelas ");
        double areajl = scanner.nextDouble();

        double areatotal =  2* (lr+ cp)*alt - (area+areajl);
        double rendimento =  areatotal/10;
        System.out.println("Tinta Necessária: " + rendimento );

        scanner.close();




    }
}
