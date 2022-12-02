package ExerciciosBootcamp;

import java.util.Scanner;

public class PalindromoJavaPuro {
    
    public static void main(String[] args) {
        
        //Utilizando particularidades da linguagem
        
        Scanner sc = new Scanner(System.in);
        String palavra = sc.nextLine();

        //StringBuffer concatena strings, usado juntamente com o reverse(), nos entrega a palavra inversa, mas é necessário converte-la para string novamente.
        String reversa = new StringBuffer(palavra).reverse().toString();

        if(palavra.toLowerCase().equals(reversa.toLowerCase())){
            System.out.println("TRUE");
        }else{
            System.out.println("FALSE");
        }
    }
}