// Enunciado: Leia a velocidade em km/h. Se for maior que 80, exiba "Multado"; caso contrario, exiba "Dentro do limite".
import java.util.Scanner;

public class at6 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Digite a velocidade em km/h: ");
    int velocidade = sc.nextInt();

    if (velocidade > 80) {
      System.out.println("Multado");
    } else {
      System.out.println("Dentro do limite");
    }

    sc.close();
  }
}
