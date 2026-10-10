// Enunciado: Leia a regiao de entrega ("Norte" ou "Sul"). Para "Norte", o frete e 50; para "Sul", o frete e 30. Imprima o valor do frete.
import java.util.Scanner;

public class at36 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite a regiao de entrega (Norte ou Sul): ");
        String regiao = sc.nextLine();

        if (regiao.equals("Norte")) {
            int frete = 50;
            System.out.println("Frete: R$ " + frete);
        } else if (regiao.equals("Sul")) {
            int frete = 30;
            System.out.println("Frete: R$ " + frete);
        }

        sc.close();
    }
}
