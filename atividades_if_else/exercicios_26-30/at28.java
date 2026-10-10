// Enunciado: Leia a pressao dos pneus de um carro. Se for menor que 28, exiba "Calibragem necessária".
import java.util.Scanner;

public class at28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite a pressao dos pneus: ");
        int pressao = sc.nextInt();

        if (pressao < 28) {
            System.out.println("Calibragem necessária");
        }

        sc.close();
    }
}
