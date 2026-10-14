/*Simule o aumento de volume de uma TV. Crie uma variável iniciando em
0 e aumente até 10 usando o laço while, imprimindo o volume atual a
cada iteração.
 */


public class at3_w {
    public static void main(String[] args) {
        int volume = 0;
        
        while (volume <= 10) {
            System.out.println("Volume atual: " + volume);
            volume++;
        }
    }
}
