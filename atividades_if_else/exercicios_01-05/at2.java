// Enunciado: Leia a senha do usuario. Se for "Admin2026", exiba "acesso liberado!"; caso contrario, exiba "acesso negado!".
import java.util.Scanner;

public class at2 {
    public static void main(String[] args){
        Scanner sc = new Scanner ( System . in );
        System.out.print ("Digite a senha: "); 
        String senha_usuario = sc.nextLine();
        
        if(senha_usuario.equals("Admin2026")){
            System.out.print ("acesso liberado!"); 
        }else{
            System.out.print (" acesso negado! "); 
        }
        
        sc.close();
    }
}
