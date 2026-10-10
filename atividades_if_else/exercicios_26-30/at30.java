// Enunciado: Leia o numero de passos do smartwatch. Se for maior ou igual a 10000, exiba "Meta Diária Atingida!"; caso contrario, exiba "Continue caminhando".
import java.util.Scanner;

public class at30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o numero de passos: ");
        int passos = sc.nextInt();

        if (passos >= 10000) {
            System.out.println("Meta Diária Atingida!");
        } else {
            System.out.println("Continue caminhando");
        }

        sc.close();
    }
}
