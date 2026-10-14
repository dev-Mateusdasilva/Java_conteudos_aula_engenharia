/*Ao fim de um jogo, pergunte ”Jogar de novo? (S/N)”. Use do-while
para ler o caractere at´e que seja digitado ’S’ ou ’N’.
 */
import java.util.Scanner;

public class at20_w {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char resposta;
        
        do {
            System.out.print("Jogar de novo? (S/N): ");
            resposta = scanner.next().toUpperCase().charAt(0);
            
            if (resposta != 'S' && resposta != 'N') {
                System.out.println("Opção inválida. Tente novamente.");
            }
        } while (resposta != 'S' && resposta != 'N');
        
        if (resposta == 'S') {
            System.out.println("Reiniciando o jogo...");
        } else {
            System.out.println("Encerrando o jogo. Até a próxima!");
        }
        
        scanner.close();
    }
}