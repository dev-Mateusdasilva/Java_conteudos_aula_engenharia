// Enunciado: Leia o limite do cartao e o valor do produto. Calcule o saldo restante apos a compra. Se o saldo restante for menor que 0, exiba "Transação Recusada".
import java.util.Scanner;

public class at39 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o limite do cartao: R$ ");
        double limite = sc.nextDouble();
        System.out.print("Digite o valor do produto: R$ ");
        double valor = sc.nextDouble();

        double saldo = limite - valor;

        if (saldo < 0) {
            System.out.println("Transação Recusada");
        }

        sc.close();
    }
}
