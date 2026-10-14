/*Um tanque comporta 100L. Comec¸ando vazio, adicione 20L por iterac¸˜ao
num lac¸o while, avisando o volume atual. Pare quando encher */
import java.util.Scanner;

public class at11_w {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int volume = 0;
        
        while (volume < 100) {
            volume += 20;
            System.out.println("Volume atual: " + volume + "L");
        }
        
        System.out.println("Tanque cheio!");
        scanner.close();
    }
}
