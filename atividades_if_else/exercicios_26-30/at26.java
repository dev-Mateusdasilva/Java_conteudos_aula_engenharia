// Enunciado: Leia o cupom de desconto. Se for "NATAL26" ou "BLACKFRIDAY", exiba "Desconto de 20% aplicado".
import java.util.Scanner;

public class at26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o cupom de desconto: ");
        String cupom = sc.nextLine();

        if (cupom.equals("NATAL26") || cupom.equals("BLACKFRIDAY")) {
            System.out.println("Desconto de 20% aplicado");
        }

        sc.close();
    }
}
