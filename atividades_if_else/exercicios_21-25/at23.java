// Enunciado: Leia a idade do pet em anos. Se for menor ou igual a 2, exiba "Filhote"; se for menor ou igual a 8, exiba "Adulto"; caso contrario, exiba "Senior".
import java.util.Scanner;

public class at23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite a idade do pet em anos: ");
        int idadePet = sc.nextInt();

        if (idadePet <= 2) {
            System.out.println("Filhote");
        } else if (idadePet <= 8) {
            System.out.println("Adulto");
        } else {
            System.out.println("Sênior");
        }

        sc.close();
    }
}
