import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    
	    Scanner sc = new Scanner(System.in);
	    System.out.println("Escreva seu nome completo");
	    String nome = sc.nextLine();
	    int tamanho = nome.length();
	    
		System.out.println("Seu nome:"+ nome);
		System.out.println("Tamanho do seu nome: "+ tamanho +  " letras");
	}
}