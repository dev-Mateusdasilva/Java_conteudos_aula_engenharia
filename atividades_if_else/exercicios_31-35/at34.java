// Enunciado: Leia a categoria da CNH ("A", "B" ou "C"). Se for "C", exiba "Habilitado para caminhões".
import java.util.Scanner;

public class at34 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite a categoria da CNH (A, B ou C): ");
        String categoria = sc.nextLine();

        if (categoria.equals("C")) {
            System.out.println("Habilitado para caminhões");
        }

        sc.close();
    }
}
