// Enunciado: Leia as horas jogadas em um game. Se forem maiores que 100, exiba "Jogador Hardcore"; caso contrario, exiba "Jogador Casual".
import java.util.Scanner;

public class at27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite as horas jogadas: ");
        int horas = sc.nextInt();

        if (horas > 100) {
            System.out.println("Jogador Hardcore");
        } else {
            System.out.println("Jogador Casual");
        }

        sc.close();
    }
}
