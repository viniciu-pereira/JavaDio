package Metodos;

public class Quadrilatero {
    
    //Criando métodos usando sobrecarga -> Mesmo nome de método para parâmetros diferentes.
    //Ao chamar, a quantidade de parâmetros define o método a ser usado.
    
    public static void area(double lado){

        //Math.pow(2, 9) -> 2^9
        System.out.println("Área do quadrado: " + Math.pow(lado, 2) );
    }

    public static void area(double lado1, double lado2){

        System.out.println("Área do retangulo: " + lado1 * lado2);
    }

    public static void area(double baseMaior, double basMenor, double altura){

        System.out.println("Área do trapézio: " + ((baseMaior + basMenor) * altura) /2);
    }
}
