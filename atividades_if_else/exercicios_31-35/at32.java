// Enunciado: Leia uma frase. Se ela comecar com "Erro:", exiba "Redirecionando para Suporte Técnico".
import java.util.Scanner;

public class at32 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite uma frase: ");
        String mensagem = sc.nextLine();

        if (mensagem.startsWith("Erro:")) {
            System.out.println("Redirecionando para Suporte Técnico");
        }

        sc.close();
    }
}
