/*Um jogador começa com 3 vidas. Use while para simular a perda de 1
vida por iteração e imprimir ”Game Over!”quando chegar a 0.
 */

public class at15_w {
    public static void main(String[] args) {
        int vidas = 3;
        
        while (vidas > 0) {
            System.out.println("Vidas restantes: " + vidas);
            vidas--;
        }
        
        System.out.println("Game Over!");
    }
}