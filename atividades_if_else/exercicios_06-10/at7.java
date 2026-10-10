// Enunciado: Leia o numero de tentativas. Se for maior ou igual a 3, exiba "Conta Bloqueada"; caso contrario, exiba "Tente novamente".
import java.util.Scanner;

public class at7 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Digite o número de tentativas: ");
    int tentativas = sc.nextInt();

    if (tentativas >= 3) {
      System.out.println("Conta Bloqueada");
    } else {
      System.out.println("Tente novamente");
    }

    sc.close();
  }
}
