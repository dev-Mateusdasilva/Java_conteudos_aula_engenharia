// Enunciado: Leia o peso da bagagem. Ate 10 kg, exiba "Bagagem de Mao Livre"; acima de 10 kg e ate 23 kg, exiba "Bagagem Despachada"; acima de 23 kg, exiba "Excesso de Peso".
import java.util.Scanner;

public class at15 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite o peso da bagagem em kg: ");
		double peso = sc.nextDouble();

		if (peso <= 10) {
			System.out.println("Bagagem de Mão Livre");
		} else if (peso <= 23) {
			System.out.println("Bagagem Despachada");
		} else {
			System.out.println("Excesso de Peso");
		}

		sc.close();
	}
}
