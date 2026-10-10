// Enunciado: Leia a umidade do solo (0 a 100). Se for menor que 30, exiba "Acionar Irrigacao"; caso contrario, exiba "Umidade OK".
import java.util.Scanner;

public class at10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite a umidade do solo (0 a 100): ");
		int umidade = sc.nextInt();

		if (umidade < 30) {
			System.out.println("Acionar Irrigação");
		} else {
			System.out.println("Umidade OK");
		}
	}
}
