// Enunciado: Leia o valor de um emprestimo e a renda mensal. Se a parcela (emprestimo / 12) for maior que 30% da renda, exiba "Recusado"; caso contrario, exiba "Aprovado".
import java.util.Scanner;

public class at22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o valor do emprestimo: R$ ");
        double emprestimo = sc.nextDouble();
        System.out.print("Digite a renda mensal: R$ ");
        double renda = sc.nextDouble();

        double parcela = emprestimo / 12;

        if (parcela > renda * 0.30) {
            System.out.println("Recusado");
        } else {
            System.out.println("Aprovado");
        }

        sc.close();
    }
}
