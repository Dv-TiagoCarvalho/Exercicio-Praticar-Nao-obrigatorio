import java.util.Scanner;

public class Exercicio0116 {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
double soma = 0;
double contador = 0;
 

 while (true) {
    System.out.println("Notas");
    double notas = scanner.nextDouble();

    if (notas< 0) {
        break;
        
    }

    soma+= notas;
    contador++;

 }

 scanner.close();
 double media = soma/contador;

 String classificaçao;
if (media>=7) {
     classificaçao="APROVADO";
    }else if (media>=5){
    classificaçao="RECUPERAÇÃO";
     } else{
    classificaçao = " REPROVADO";
     }
     System.out.println("Média = " + media);
     System.out.println("Classificação = " + classificaçao);

    
 }






    


}


