/*Simule um menu: 1-Audio, 2-Vídeo, 3-Sair. Use do-while para voltar ao
menu a menos que o usuário escolha a opção 3.
 */

import java.util.Scanner;

public class at12_w {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao;
        
        do {
            System.out.println("Menu:");
            System.out.println("1 - Áudio");
            System.out.println("2 - Vídeo");
            System.out.println("3 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            
            switch (opcao) {
                case 1:
                    System.out.println("Você escolheu Áudio.");
                    break;
                case 2:
                    System.out.println("Você escolheu Vídeo.");
                    break;
                case 3:
                    System.out.println("Saindo do menu.");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (opcao != 3);
        
        scanner.close();
    }
}
