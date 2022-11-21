import java.util.Random;

public class NumerosAleatorios {
    
    public static void main(String[] args) {
        
        /*
         * Crie um programa que leia números aleatórios entre 0 e 100 e os armazene em um vetor
         * 
         * Ao final, mostre os números e seus sucessores
         */

         Random random = new Random();

         int[] numerosAleatorios = new int[20];

         for(int i =0; i < numerosAleatorios.length; i++){
            int numero = random.nextInt(100);
            numerosAleatorios[i] = numero;
        }

        //Numeros Aleatórios
        System.out.println("Numeros Aleatórios: ");
        for (int numero : numerosAleatorios ){
            System.out.print(numero + " ");
        }
        
        System.out.println("\nSucessores dos números aleatórios: ");
        for(int numero : numerosAleatorios){
            System.out.print(numero + 1 + " ");
        }
    }
}
