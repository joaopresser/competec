import java.util.Scanner;
public class Exercicio04
{
	public static void main(String[] args) {
	      Scanner scannerNumero = new Scanner(System.in);
       
    System.out.println("Digite um número inteiro:");
    int num = scannerNumero.nextInt();
     
    for(int i=1; i<=10; i++){
        System.out.println(i * num);
    }
	
	}
}