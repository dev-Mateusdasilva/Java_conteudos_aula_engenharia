// Enunciado: Leia o ano de nascimento do cliente e calcule a idade usando 2026 - nascimento. Se a idade for maior ou igual a 18, exiba "Pode assinar contrato".
import java.util.Scanner;

public class at31 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o ano de nascimento: ");
        int nascimento = sc.nextInt();
        int idade = 2026 - nascimento;

        if (idade >= 18) {
            System.out.println("Pode assinar contrato");
        }

        sc.close();
    }
}
