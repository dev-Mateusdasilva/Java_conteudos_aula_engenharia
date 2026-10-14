/*Um banco vai chamar as senhas de 1 a 5. Use um laço while para
imprimir ”Chamando senha X” até chegar á senha 5.
 */

public class at17_w {
    public static void main(String[] args) {
        int senha = 1;
        
        while (senha <= 5) {
            System.out.println("Chamando senha " + senha);
            senha++;
        }
        
        System.out.println("Todas as senhas foram chamadas.");
    }
}