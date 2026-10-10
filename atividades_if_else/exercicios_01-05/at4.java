// Enunciado: Leia uma postagem. Se tiver mais de 280 caracteres, exiba "Limite excedido"; caso contrario, exiba "Postagem aceita".
import java.util.Scanner;

public class at4 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Digite sua postagem: ");
    String postagem = sc.nextLine();
    int tamanho = postagem.length();

    if (tamanho > 280) {
      System.out.println("Limite excedido");
    } else {
      System.out.println("Postagem aceita");
    }

    sc.close();
  }
}