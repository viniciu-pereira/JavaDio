package ExerciciosBootcamp;

import java.util.*;
import java.util.Scanner;

public class ClassificandoMatrizes {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        // Declatando vetor e seu numero de posiçoes
        int NumeroPosicoes = scan.nextInt();
        int[] vetor = new int[NumeroPosicoes];

        // Inserindo os valores no vetor
        for (int i = 0; i < NumeroPosicoes; i++) {
            vetor[i] = scan.nextInt();
        }

        // SEPARANDO ELEMENTOS

        // Criacao do vetor de pares
        int TamanhoVetorPares = 0;
        for (int i = 0; i < NumeroPosicoes; i++) {
            if (vetor[i] % 2 == 0) {
                TamanhoVetorPares++;
            }
        }
        int[] pares = new int[TamanhoVetorPares];

        // Criacao do vetor de impares
        int[] impares = new int[NumeroPosicoes - TamanhoVetorPares];


        //inserindo nos vetores
        int j = 0; //contador para pares
        int k = 0; //contador para impares
        for(int i = 0; i < NumeroPosicoes; i++){

            if(vetor[i] % 2 == 0){
                pares[j] = vetor[i];
                j++;
                //System.out.print(pares[j]);
            }else{
                impares[k] = vetor[i];
                k++;
                //System.out.print("\n" + impares[k]);
            }
        }
        for(int i = 0; i < pares.length; i++){
            System.out.println(pares[i]);
        }
        for(int i = 0; i < impares.length; i++){
            System.out.println(impares[i]);
        }


    }
}