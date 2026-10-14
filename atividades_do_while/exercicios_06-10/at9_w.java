/*A temperatura atual é 15°C e o ar condicionado foi ajustado para 20°C.
Aumente 1 grau por vez com while até atingir a meta, imprimindo a
temperatura.
 */

public class at9_w {
    public static void main(String[] args) {
        int temperatura = 15;
        int meta = 20;

        while (temperatura < meta) {
            temperatura++;
            System.out.println("Temperatura: " + temperatura + "°C");
        }
    }
}
