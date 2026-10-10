// Enunciado: Leia o numero de matricula de um aluno. Se for par, exiba "Turma A"; se for impar, exiba "Turma B".
import java.util.Scanner;

public class at13 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite o número de matrícula: ");
		int matricula = sc.nextInt();

		if (matricula % 2 == 0) {
			System.out.println("Turma A");
		} else {
			System.out.println("Turma B");
		}

		sc.close();
	}
}
