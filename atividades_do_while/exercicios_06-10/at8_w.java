/*Mostre o menu ”1-Café, 2-Leite”. Continue pedindo a opção com
do-while enquanto o usuário digitar opções diferentes de 1 e 2.
 */

import java.util.Scanner;

public class at8_w {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao;
        
        do {
            System.out.print("Escolha uma opção (1-Café, 2-Leite): ");
            opcao = scanner.nextInt();
        } while (opcao != 1 && opcao != 2);
        
        if (opcao == 1) {
            System.out.println("Você escolheu Café.");
        } else {
            System.out.println("Você escolheu Leite.");
        }
        
        scanner.close();
    }
}
