// Enunciado: Leia o codigo de validacao de um ingresso. Se, convertido para maiusculas, for igual a "VIP", exiba "Acesso ao Lounge".
import java.util.Scanner;

public class at12 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite o código do ingresso: ");
		String ingresso = sc.nextLine();
		String ingressoFormatado = ingresso.toUpperCase();

		if (ingressoFormatado.equals("VIP")) {
			System.out.println("Acesso ao Lounge");
		}

		sc.close();
	}
}
