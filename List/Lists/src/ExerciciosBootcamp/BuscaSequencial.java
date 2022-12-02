package ExerciciosBootcamp;

// IMPORTANTE: Para ler os dados de entrada do usuário, utilize a classe Scanner, 
// instanciando seu leitor da seguinte forma: "Scanner leitor = new Scanner(System.in);". 
// Por outro lado, para imprimir suas saídas, utilize System.out.print ou System.out.println. 

import java.util.*;

import javax.swing.plaf.synth.SynthOptionPaneUI;
public class BuscaSequencial {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        int numero = leitor.nextInt();

        int[] elementos = {64, 137, -16, 43, 67, 81, -90, 212, 10, 75}; 

        //TODO: Retorne o valor do elemento no Array junto de sua respectiva posição.

        buscar(numero, elementos);
    }//end main
    
    public static void buscar(int numero, int vetor[]){

        boolean encontrado = false;

        for(int i = 0; i < vetor.length; i++){
            
            if(numero == vetor[i]){
                System.out.println("Achei " + numero + " na posicao " + i);
                encontrado = true;
            }
        }

        if(encontrado == false){
            System.out.println("Numero " + numero + " nao encontrado!");
        }
    }

}//end class