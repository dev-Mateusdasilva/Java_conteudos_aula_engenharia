/*Um ônibus tem limite de 5 passageiros sentados. Use while para
registrar a entrada de 1 a 5, imprimindo ”Passageiro X entrou”.
 */

public class at13_w {
    public static void main(String[] args) {
        int passageiros = 0;
        
        while (passageiros < 5) {
            passageiros++;
            System.out.println("Passageiro " + passageiros + " entrou.");
        }
        
        System.out.println("Ônibus cheio!");
    }
}
