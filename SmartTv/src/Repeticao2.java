import java.util.Scanner;

public class Repeticao2 {
    
    public static void main(String[] args) {
        
        /*
         * Script que peça uma nota entre 0 e 10
         * Mostre uma mensagem caso seja invalida 
         * continue pedindo ate que seja valido
         */

        int nota;

        Scanner scan = new Scanner(System.in);

        System.out.println("Insira a nota:");
        nota = scan.nextInt();

        while(nota < 0 || nota > 10) {
            System.out.println("Nota invalida");
            System.out.println("Insira a nota:");
            nota = scan.nextInt();

        }
    }
}
