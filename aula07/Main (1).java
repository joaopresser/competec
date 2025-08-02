import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
    
    
    String[] produto = new String[3];
    System.out.println("Qual o nome do produto?");
    
    produto[0] = sc.nextLine();
     produto[1] = sc.nextLine();
      produto[2] = sc.nextLine();
      
      	Scanner pc = new Scanner(System.in);
      double[] preço = new double[3];
    System.out.println("Qual o preço do produto?");
      
        preço[0] = pc.nextDouble();
     preço[1] = pc.nextDouble();
      preço[2] = pc.nextDouble();
      
    
    	Scanner qt = new Scanner(System.in);
      int[] quantidade = new int[3];
    System.out.println("Qual a quantidade do produto?");
      
        quantidade[0] = qt.nextInt();
     quantidade[1] = qt.nextInt();
      quantidade[2] = qt.nextInt();
      
      double estoque_produto1 = (preço[0]*quantidade[0]);
      double estoque_produto2 = (preço[1]*quantidade[1]);
      double estoque_produto3 = (preço[2]*quantidade[2]);
      
      
      System.out.println("O preço de estoque do produto "+ produto[0] +" é R$"+estoque_produto1);
      System.out.println("O preço de estoque do produto " + produto[1] +" é R$"+estoque_produto2);
      System.out.println("O preço de estoque do produto " + produto[2] +" é R$"+estoque_produto3);
      
      if (estoque_produto1 > estoque_produto2 && estoque_produto1 > estoque_produto3) {
          System.out.println("O estoque do produto " + produto[0] + " é maior");
      }
      
      else if (estoque_produto2 > estoque_produto1 && estoque_produto2 > estoque_produto3) {
          System.out.println("O estoque do produto " + produto[1] + " é maior");
      }
       else  
       System.out.println("O estoque do produto " + produto[2]  + " é maior");
	
	}
	
}