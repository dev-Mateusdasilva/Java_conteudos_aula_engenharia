// Enunciado: Leia o CPF digitado. Se nao tiver exatamente 11 caracteres, exiba "CPF Inválido"; caso contrario, exiba "CPF Formato Válido".
import java.util.Scanner;

public class at24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o CPF: ");
        String cpf = sc.nextLine();

        if (cpf.length() != 11) {
            System.out.println("CPF Inválido");
        } else {
            System.out.println("CPF Formato Válido");
        }

        sc.close();
    }
}
