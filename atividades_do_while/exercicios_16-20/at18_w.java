/*A meta é 2000ml. Use do-while pedindo quantos ml foram bebidos,
somando ao total, e pare apenas quando atingir 2000ml.
 */

public class at18_w {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        int totalBebido = 0;
        int mlBebidos;
        
        do {
            System.out.print("Quantos ml foram bebidos? ");
            mlBebidos = scanner.nextInt();
            totalBebido += mlBebidos;
            System.out.println("Total bebido: " + totalBebido + "ml");
        } while (totalBebido < 2000);
        
        System.out.println("Meta atingida! Total bebido: " + totalBebido + "ml");
        scanner.close();
    }
}