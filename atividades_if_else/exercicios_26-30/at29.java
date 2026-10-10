// Enunciado: Leia a forma de pagamento ("Pix" ou "Cartão"). Se for "Pix", exiba "Pagamento Imediato"; se for "Cartão", exiba "Pagamento em Análise".
import java.util.Scanner;

public class at29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite a forma de pagamento (Pix ou Cartão): ");
        String metodo = sc.nextLine();

        if (metodo.equals("Pix")) {
            System.out.println("Pagamento Imediato");
        } else if (metodo.equals("Cartão")) {
            System.out.println("Pagamento em Análise");
        }

        sc.close();
    }
}
