import java.util.Scanner;
public class Exercicio02 {
  public static void main(String args[]) {
      Scanner entrada = new Scanner(System.in);
      int tamanho = entrada.nextInt();
      
      int numeros[] = new int[tamanho];
      

      for(int i = 0;i < numeros.length; i++){
              numeros[i] = entrada.nextInt();
      }
  
      
      for(int n : numeros){
                System.out.print(n + " ");
      }

      
  }
}