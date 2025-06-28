import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    
		Scanner sc = new Scanner(System.in);
	    System.out.println("Qual a palavra secreta?");
	    String palavraSecreta = sc.nextLine();
	    
	    if (palavraSecreta.equalsIgnoreCase("Batata")){
	        System.out.println("Parabéns, você acertou!");
	    }
	    else{
	        System.out.println("Que pena, você errou");
	    }
	}
}