/*Peça para o usuário avaliar um aplicativo com uma nota de 1 a 5. Use
do-while para garantir que a nota informada esteja nesse intervalo. */

import java.util.Scanner;

public class at16_w {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nota;
        
        do {
            System.out.print("Digite uma nota de 1 a 5: ");
            nota = scanner.nextInt();
            
            if (nota < 1 || nota > 5) {
                System.out.println("Nota inválida. Tente novamente.");
            }
        } while (nota < 1 || nota > 5);
        
        System.out.println("Você avaliou o aplicativo com a nota: " + nota);
        scanner.close();
    }
}