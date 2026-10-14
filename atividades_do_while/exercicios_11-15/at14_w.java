/*O saque mínimo é R$ 20. Peça o valor desejado usando do-while
enquanto o valor digitado for menor que 20.
 */

import java.util.Scanner;

public class at14_w {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int valor;
        
        do {
            System.out.print("Digite o valor desejado (mínimo R$ 20): ");
            valor = scanner.nextInt();
            
            if (valor < 20) {
                System.out.println("Valor inválido. Tente novamente.");
            }
        } while (valor < 20);
        
        System.out.println("Você solicitou um saque de R$ " + valor);
        scanner.close();
    }
}