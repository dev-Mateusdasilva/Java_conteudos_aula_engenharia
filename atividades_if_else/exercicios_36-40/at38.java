// Enunciado: Leia os batimentos cardiacos (BPM). Se forem menores que 40 ou maiores que 120, exiba "Alerta Médico Imediato".
import java.util.Scanner;

public class at38 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite os batimentos cardiacos (BPM): ");
        int bpm = sc.nextInt();

        if (bpm < 40 || bpm > 120) {
            System.out.println("Alerta Médico Imediato");
        }

        sc.close();
    }
}
