// Enunciado: Leia a idade de um paciente. Se for maior ou igual a 60, exiba "Fila Prioritaria"; se for menor que 60, exiba "Fila Comum".
import java.util.Scanner;

public class at11 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite a idade do paciente: ");
		int idadePaciente = sc.nextInt();

		if (idadePaciente >= 60) {
			System.out.println("Fila Prioritária");
		} else {
			System.out.println("Fila Comum");
		}

		sc.close();
	}
}
