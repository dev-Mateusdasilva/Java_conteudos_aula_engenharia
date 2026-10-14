/*Exercicio 6: Urna Eletrônica (do-while)
Peça o numero do candidato (13 ou 22). Se for digitado um numero ´
inválido, repita a solicitação usando do-while.
 */

import java.util.Scanner;

public class at6_w {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int candidato;

        do {
            System.out.print("Digite o número do candidato (13 ou 22): ");
            candidato = scanner.nextInt();
        } while (candidato != 13 && candidato != 22);

        System.out.println("Voto registrado para o candidato " + candidato);
        scanner.close();
    }
}
