// Enunciado: Leia o status da nota fiscal ("Emitida", "Pendente" ou "Cancelada"). Se for "Pendente", exiba "Aguardando Pagamento"; se for "Emitida", exiba "Pronta para Envio".
import java.util.Scanner;

public class at9 {
    public static void main(String[] args){
        Scanner sc =  new Scanner(System.in);
        System.out.print("Digite o status da nota fiscal (Emitida, Pendente ou Cancelada): ");
        String statusNF = sc.nextLine();
        
        if (statusNF.equals("Pendente")) {
            System.out.println("Aguardando Pagamento");
        } else if (statusNF.equals("Emitida")) {
            System.out.println("Pronta para Envio");
        }
    }
}
