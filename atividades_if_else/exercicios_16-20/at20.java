// Enunciado: Leia a avaliacao em estrelas de um app (1 a 5). Se for menor que 3, exiba "Pedir feedback". Se for maior ou igual a 4, exiba "Pedir avaliacao na loja".
import java.util.Scanner;

public class at20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite a avaliacao do app em estrelas (1 a 5): ");
        int estrelas = sc.nextInt();

        if (estrelas < 3) {
            System.out.println("Pedir feedback");
        } else if (estrelas >= 4) {
            System.out.println("Pedir avaliação na loja");
        }

        sc.close();
    }
}
