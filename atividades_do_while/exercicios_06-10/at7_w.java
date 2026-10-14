/*Simule uma barra de download que inicia em 0% e incrementa 25% a
cada volta do laço while, até atingir 100%. Imprima o progresso */

public class at7_w {
    public static void main(String[] args) {
        int progresso = 0;

        while (progresso < 100) {
            progresso += 25;
            System.out.println("Progresso: " + progresso + "%");
        }
    }
}
