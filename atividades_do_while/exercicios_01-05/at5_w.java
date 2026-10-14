/*Uma bateria começa com 5% e descarrega 1% por iteração. Imprima
”Bateria fraca: X%”usando while até chegar a 0. Depois, avise
”Desligando...”.
 */

public class at5_w {
    public static void main(String[] args) {
        int bateria = 5;

        while (bateria > 0) {
            System.out.println("Bateria fraca: " + bateria + "%");
            bateria--;
        }

        System.out.println("Desligando...");
    }
}
