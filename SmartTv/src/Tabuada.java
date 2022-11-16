import java.util.Scanner;

public class Tabuada {
    
    /*
     * Desenvolva um gerador de tabuada:
     * O usuario deve informar de qual numero quer a tabuada e o sistema deve ser:
     *  numero * 1 = numero
     * ...
     */

     public static void main(String[] args) {

        System.out.println("Insira o valor:");
        Scanner scan = new Scanner(System.in);
        int tabuada = scan.nextInt();

        System.out.println("Tabuada de: " + tabuada);

        for(int i = 0; i < 10; i++) {

            int resultado = tabuada * i;

            System.out.println("Resultado: " + tabuada + "* " + i + "= " + resultado);
        }
    }
}
