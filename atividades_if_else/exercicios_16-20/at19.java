// Enunciado: Leia o nivel de acesso do usuario. Se for "Gestor" ou "Admin", exiba "Acesso ao Relatorio"; caso contrario, exiba "Acesso Negado".
import java.util.Scanner;

public class at19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o nivel de acesso: ");
        String nivelAcesso = sc.nextLine();

        if (nivelAcesso.equals("Gestor") || nivelAcesso.equals("Admin")) {
            System.out.println("Acesso ao Relatório");
        } else {
            System.out.println("Acesso Negado");
        }

        sc.close();
    }
}
