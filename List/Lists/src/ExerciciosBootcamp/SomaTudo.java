package ExerciciosBootcamp;

// IMPORTANTE: Para ler os dados de entrada do usuário, utilize a classe Scanner, 
// instanciando seu leitor da seguinte forma: "Scanner leitor = new Scanner(System.in);". 
// Por outro lado, para imprimir suas saídas, utilize System.out.print ou System.out.println.  

import java.util.*;

public class SomaTudo {

    public static void main(String[] args) {

        Scanner numero = new Scanner(System.in);
        int num = numero.nextInt();
        //TODO: Imprima o somatório de N (utilize o método "somatorio").
        System.out.println(somatorio(num));
    }

    /**
     * Método útil que calcula o somatório de um número usando recursividade.
     */
    static int somatorio(int numero) {
        if (numero == 0) {
            return 0;
        } else {
            return numero + somatorio(numero - 1);
        }
    }
}