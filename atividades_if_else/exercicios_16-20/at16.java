// Enunciado: Leia o consumo de API em chamadas. Se exceder 1000, exiba "Plano Pro Necessario"; caso contrario, exiba "Dentro do Limite Gratuito".
import java.util.Scanner;

public class at16 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite o consumo de API em chamadas: ");
		int chamadasAPI = sc.nextInt();

		if (chamadasAPI > 1000) {
			System.out.println("Plano Pro Necessário");
		} else {
			System.out.println("Dentro do Limite Gratuito");
		}

		sc.close();
	}
}
