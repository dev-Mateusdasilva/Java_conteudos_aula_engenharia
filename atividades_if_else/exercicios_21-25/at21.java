// Enunciado: Leia o tipo de combustivel escolhido ("A" para Alcool, "G" para Gasolina). Se for "A", exiba "Bomba 1 ativada". Se for "G", exiba "Bomba 2 ativada".
import java.util.Scanner;

public class at21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Escolha o combustivel (A para Alcool, G para Gasolina): ");
        String combustivel = sc.nextLine();

        if (combustivel.equals("A")) {
            System.out.println("Bomba 1 ativada");
        } else if (combustivel.equals("G")) {
            System.out.println("Bomba 2 ativada");
        }

        sc.close();
    }
}
