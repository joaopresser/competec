import java.util.Scanner;
public class Exercicio05
{
	public static void main(String[] args) {
	      Scanner scannerNumero = new Scanner(System.in);
       
    System.out.println("Digite um número inteiro:");
    int num = scannerNumero.nextInt();
     
    for(int i=1; i<=num; i+=2){
        System.out.println(i);
    }
	
	}
}