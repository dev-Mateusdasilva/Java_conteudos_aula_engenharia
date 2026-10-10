// Enunciado: Leia o numero de quartos desejados em um hotel de luxo. Se for maior que 5, exiba "Encaminhar para Setor de Grupos"; caso contrario, exiba "Reserva Padrão".
import java.util.Scanner;

public class at25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o numero de quartos desejados: ");
        int quartos = sc.nextInt();

        if (quartos > 5) {
            System.out.println("Encaminhar para Setor de Grupos");
        } else {
            System.out.println("Reserva Padrão");
        }

        sc.close();
    }
}
