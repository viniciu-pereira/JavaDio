package ExerciciosBootcamp;

import java.util.*;

public class FizzBuz {

    public static void main(String[] args) {

        Scanner number = new Scanner(System.in);
        int num = number.nextInt();

        sum(num);

        // TODO: Retorne a palavra correta de acordo com o múltiplo de "num".
        // Caso o valor não seja múltiplo de 3 ou 5, exiba o número, conforme o
        // enunciado.

    }

    static void sum(int numero){

        if(numero % 3 == 0 && numero % 5 != 0){
          System.out.println("Fizz");
        }if(numero % 5 == 0 && numero % 3 != 0){
          System.out.println("Buzz");
        }if(numero % 5 == 0 && numero % 3 == 0){
          System.out.println("FizzBuzz");
        }if(numero % 5 != 0 && numero % 3 != 0){
          System.out.println(numero);
        }
    }
}
