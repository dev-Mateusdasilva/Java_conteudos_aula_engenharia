// Enunciado: Leia o valor da compra. Se for maior que R$ 300, exiba "Frete Gratis"; caso contrario, exiba "Frete R$ 25.00".
import java.util.Scanner;

public class at5 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Digite o valor da compra em reais: R$ ");
    double valorCompra = sc.nextDouble();

    if (valorCompra > 300) {
      System.out.println("Frete Grátis");
    } else {
      System.out.println("Frete R$ 25.00");
    }

    sc.close();
  }
} 
    

