package ExerciciosBootcamp;

// IMPORTANTE: Para ler os dados de entrada do usuário, utilize a classe Scanner, 
// instanciando seu leitor da seguinte forma: "Scanner leitor = new Scanner(System.in);". 
// Por outro lado, para imprimir suas saídas, utilize System.out.print ou System.out.println.

import java.util.*;

public class ValidParentheses {

    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        boolean caracter = ehValido(scanner.nextLine());

        System.out.println(caracter);
    }

    public static boolean ehValido(String s) {
        //TODO: implemente a lógica de caracteres válidos e retorne se a string é valida ou não.

        if(s.equals("()") || s.equals("[]") || s.equals("{}")){
            return true;
        }
        return false;
    }
}
