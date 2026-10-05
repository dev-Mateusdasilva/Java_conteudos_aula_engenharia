import java.util.Scanner;

public class at_dois {
    public static void main(String[] args){
        Scanner sc = new Scanner ( System . in );
        double total_produto;

        System.out.print (" Digite o nome do produto: "); 
        String nome_produto = sc.nextLine();
        
        System.out.print (" Digite o valor do produto: "); 
        double preco_produto = sc.nextDouble();
        
        total_produto = preco_produto - (preco_produto * 0.10);

        System.err.println("O produto " + nome_produto + " custava " + preco_produto + ", mas com desconto sai por R$ " + total_produto);
    }
}