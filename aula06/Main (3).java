import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    
	    Scanner sc = new Scanner(System.in);
	    System.out.println("Escreva seu nome completo");
	    String nome = sc.nextLine();
	    String[] nomePartes = nome.split(" ");
	    int tamanho = nomePartes[0].length();
		int tamanho1 = nomePartes[1].length();
		int tamanho2 = nomePartes[2].length();
	    
		System.out.println("Seu nome:"+ nome);
		System.out.println("Nome do meio: "+ nomePartes[1]);
		System.out.println("Seu nome tem :"+ (tamanho+tamanho1+tamanho2) + " letras");
		
		
	}
}