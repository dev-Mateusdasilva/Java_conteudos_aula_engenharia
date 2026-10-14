/*Simule um sistema perguntando ”Deseja excluir? (1-Sim / 0-N˜ao)”.
Repita a pergunta com do-while até que o usuário digite uma opção 
válida (1 ou 0). */

import java.util.Scanner;

public class at4_w {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao;
        
        do {
            System.out.print("Deseja excluir? (1-Sim / 0-Não): ");
            opcao = scanner.nextInt();
        } while (opcao != 1 && opcao != 0);
        
        if (opcao == 1) {
            System.out.println("Exclusão realizada.");
        } else {
            System.out.println("Operação cancelada.");
        }
        
        scanner.close();
    }
}
