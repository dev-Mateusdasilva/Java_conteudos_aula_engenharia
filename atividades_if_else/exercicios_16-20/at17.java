// Enunciado: Leia a temperatura do servidor. Se for maior que 85.0, exiba "Risco de Superaquecimento - Reduzindo Clock".
import java.util.Scanner;

public class at17 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite a temperatura do servidor em °C: ");
		double tempServidor = sc.nextDouble();

		if (tempServidor > 85.0) {
			System.out.println("Risco de Superaquecimento - Reduzindo Clock");
		}

		sc.close();
	}
}
