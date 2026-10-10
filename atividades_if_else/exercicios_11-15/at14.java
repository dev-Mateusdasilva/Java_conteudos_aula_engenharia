// Enunciado: Leia a carga da bateria do celular. Se for menor ou igual a 15, exiba "Modo Economia Ativado"; caso contrario, exiba "Operacao Normal".
import java.util.Scanner;

public class at14 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite a carga da bateria (0 a 100): ");
		int bateria = sc.nextInt();

		if (bateria <= 15) {
			System.out.println("Modo Economia Ativado");
		} else {
			System.out.println("Operação Normal");
		}

		sc.close();
	}
}
