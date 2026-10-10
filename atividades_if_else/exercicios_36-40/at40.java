// Enunciado: Leia a extensao de um arquivo ("jpg", "pdf"). Se nao for "pdf", exiba "Apenas PDFs são aceitos para currículos".
import java.util.Scanner;

public class at40 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite a extensao do arquivo: ");
        String extensao = sc.nextLine();

        if (!extensao.equals("pdf")) {
            System.out.println("Apenas PDFs são aceitos para currículos");
        }

        sc.close();
    }
}
