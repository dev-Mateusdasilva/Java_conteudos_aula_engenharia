// Enunciado: Leia os pontos de fidelidade do cliente. Se forem maiores ou iguais a 500, exiba "Resgatar Produto"; caso contrario, exiba "Continue comprando".
import java.util.Scanner;

public class at18 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite os pontos de fidelidade: ");
		int pontosFidelidade = sc.nextInt();

		if (pontosFidelidade >= 500) {
			System.out.println("Resgatar Produto");
		} else {
			System.out.println("Continue comprando");
		}

		sc.close();
	}
}
