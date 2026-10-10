// Enunciado: Leia o turno. Se for "N", exiba "Adicional Noturno Aplicado".
import java.util.Scanner;

public class at8 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Digite o turno (N para noturno): ");
    String turno = sc.nextLine();

    if (turno.equals("N")) {
      System.out.println("Adicional Noturno Aplicado");
    }

    sc.close();
  }
}