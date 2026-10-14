/*Escreva um programa que peça uma senha numérica. Utilize o laço
do-while para continuar pedindo a senha enquanto o usuário não digitar
o valor correto (1234). Quando acertar, mostre ”Acesso Permitido!”.
 */


import java.util.Scanner;

public class at2_w {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int senha;
        
        do {
            System.out.print("Digite a senha numérica: ");
            senha = scanner.nextInt();
        } while (senha != 1234);
        
        System.out.println("Acesso Permitido!");
        scanner.close();
    }
}
