// Enunciado: Leia o nivel do tanque do veiculo em litros. Se for menor ou igual a 5.0, exiba "Aviso: Entrando na Reserva".
import java.util.Scanner;

public class at35 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o nivel do tanque em litros: ");
        double tanque = sc.nextDouble();

        if (tanque <= 5.0) {
            System.out.println("Aviso: Entrando na Reserva");
        }

        sc.close();
    }
}
