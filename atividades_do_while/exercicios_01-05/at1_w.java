/* Crie um programa que defina uma variável contador com o valor 10.
Utilizando o laço while, faça uma contagem regressiva até 1. Ao final,
imprima ”Fogo!”.
*/



public class at1_w {
    public static void main(String[] args) {
        int contador = 10;
        
        while (contador >= 1) {
            System.out.println(contador);
            contador--;
        }
        
        System.out.println("Fogo!");
    }
}
