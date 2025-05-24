import java.util.Scanner;
public class Exercicio1 {
  public static void main(String[] args) {
       Scanner scannerPalavra = new Scanner(System.in);
       
    System.out.println("Digite uma palavra:");
    String palavra = scannerPalavra.nextLine();
     
     int x = 0;
     while (x<5) {
          System.out.println(palavra);
         x++;
     }
  }
}