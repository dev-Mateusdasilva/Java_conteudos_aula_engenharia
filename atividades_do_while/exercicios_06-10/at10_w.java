/*Peça a idade do usuário. Repita a solicitação com do-while caso a
idade digitada seja menor que 0 ou maior que 120.
 */

import java.util.Scanner;

public class at10_w {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int idade;
        
        do {
            System.out.print("Digite sua idade (0-120): ");
            idade = scanner.nextInt();
        } while (idade < 0 || idade > 120);
        
        System.out.println("Idade válida: " + idade);
        
        scanner.close();
    }
}
