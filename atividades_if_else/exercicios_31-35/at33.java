// Enunciado: Leia o numero do andar do elevador. Se for menor que 0, exiba "Subsolo"; se for 0, exiba "Térreo"; caso contrario, exiba "Andar Superior".
import java.util.Scanner;

public class at33 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o numero do andar: ");
        int andar = sc.nextInt();

        if (andar < 0) {
            System.out.println("Subsolo");
        } else if (andar == 0) {
            System.out.println("Térreo");
        } else {
            System.out.println("Andar Superior");
        }

        sc.close();
    }
}
