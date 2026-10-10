// Enunciado: Leia o saldo da conta e o valor do saque. Se o saque nao exceder o saldo, exiba "saque aprovado"; caso contrario, exiba "saque insuficiente!".
import java.util.Scanner;

public class at1 {
 public  static void main(String[] args){
    Scanner sc = new Scanner ( System . in );
    System.out.print (" Digite o valor da sua conta: "); 
    double conta = sc.nextDouble();
     
    System.out.print (" Digite o valor que deseja sacar: "); 
    double valor_saque = sc.nextDouble();
    
    if(valor_saque <= conta){
      
        System.out.println("saque aprovado");
    }else{
        System.out.println("saque insuficiente!");
    }
 }
}



