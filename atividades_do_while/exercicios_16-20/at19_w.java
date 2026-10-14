/*Uma impressora tem 3 documentos na fila. Use while para reduzir a fila
até 0, exibindo ”Imprimindo... Fila: X”.
 */

public class at19_w {
    public static void main(String[] args) {
        int fila = 3;
        
        while (fila > 0) {
            System.out.println("Imprimindo... Fila: " + fila);
            fila--;
        }
        
        System.out.println("Todos os documentos foram impressos.");
    }
}