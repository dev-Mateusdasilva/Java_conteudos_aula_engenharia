// Enunciado: Leia o ano de fabricacao do veiculo. Se for anterior a 2004, exiba "Isento de IPVA"; caso contrario, exiba "IPVA Devido".
import java.util.Scanner;

public class at3 {
    public static void main(String[] args){
        Scanner sc = new Scanner ( System . in );
        System.out.println("Digite o ano de fabricação do seu veiculo: ");
        int anoCarro = sc.nextInt();

        if (anoCarro < 2004) {
            System.out.println("Isento de IPVA");
        }else{
             System.out.println("IPVA Devido");
        }
        sc.close();
    }
}