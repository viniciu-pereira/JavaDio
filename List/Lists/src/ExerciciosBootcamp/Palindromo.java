package ExerciciosBootcamp;

import java.util.Scanner;

public class Palindromo {

    public static void main(String[] args) {

        //Captura a palavra
        Scanner sc = new Scanner(System.in);
        String palavra = sc.nextLine();

        //Variavel para armazenar a palavra inversa
        String reversa = "";

        //TODO: Retorne TRUE ou FALSE, caso a "palavra" seja ou não um Palíndromo.

        //For para separar cada letra da palavra e armazenar em outra string a palavra reversa
            //length - 1 por conta de começar a contar na posição 0 -> "radar", 5 letras, mas 4 posições
        for(int i = (palavra.length() - 1); i >= 0; i--) {
            reversa += palavra.charAt(i);
        }

        //Verificacao se as duas formas da palavra são iguais
        if(reversa.toLowerCase().equals(palavra.toLowerCase())){
            System.out.println("TRUE");
        }else{
            System.out.println("FALSE");
        }
    
    } 
}
