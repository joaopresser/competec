import java.util.Scanner;  // Import the Scanner class

class Main {
  public static void main(String[] args) {
    Scanner scannerPedido = new Scanner(System.in);  // Create a Scanner object
    System.out.println("Faça seu pedido:");
    String meuPedido = scannerPedido.next();  // Read user input
        
        System.out.println("Qual a quantidade de itens?:");
     double qntPedido = scannerPedido.nextDouble();  // Read user input
    
    double precoPedido = 0;
    
    
      

     
     if (meuPedido.equals("batata")){
     precoPedido = 9.0;
     }
     else if (meuPedido.equals("hamburguer")){
      precoPedido = 20.0;
     }
     else if (meuPedido.equals("refri")) {
      precoPedido = 7.0;
    }
    
    
     

    double carrinho = precoPedido*qntPedido;
    
        System.out.println("O preço do pedido é:" + carrinho);
  }
}