import java.util.Scanner;

public class ParEImpar {
    
    public static void main(String[] args) {
        
        /*
         * Faça um programa que receba N numeros inteiros,
         * calcule e mostre a quantidade de numeros pares
         * e a quantidade de numeros impares.
         */

         Scanner scan = new Scanner(System.in);

        int quantNumero = 0;
        int count = 0;
        int numero = 0;
        int quantPar = 0, quantImpar = 0;

        System.out.println("Quantos numeros ");
        quantNumero = scan.nextInt();
        

        do{
            System.out.println("Numero: ");
            numero = scan.nextInt();
            
            if(numero % 2 == 0) quantPar++;
            else if(quantNumero % 2 != 0) quantImpar++;

            count++;
        }while(count < quantNumero);

        System.out.println("Numeros: " + quantNumero);
        System.out.println("Pares: " + quantPar);
        System.out.println("Impares: " + quantImpar);
    }
}
