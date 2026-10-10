// Enunciado: Leia o numero de visualizacoes de um video. Se for maior que 1000000, exiba "Vídeo Viral".
import java.util.Scanner;

public class at37 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o numero de visualizacoes: ");
        int views = sc.nextInt();

        if (views > 1000000) {
            System.out.println("Vídeo Viral");
        }

        sc.close();
    }
}
