public class TiposVariaveis {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");


        //Variaveis e constantes
        int a = 1;

        //valor da variavel nao pode ser alterado
        final double VALOR_DE_PI = 3.14;

        /*  
        Operadores ternários

        if normal em uma linha apenas:
        */

        int num1 = 2,  num2 = 3;
        String resultados = "";
        

        if (num1 == num2)
            resultados = "verdadeiro";
        else
            resultados = "falso";

        System.out.println(resultados);

        //Using ternary operator

        int num3 = 2;
        int num4 = 4;


        String resultadoFinal = num3==num4 ? "verdadeiro" : "falso";
        System.out.println(resultadoFinal);

        /*  Comparar conteudo de objetos:
        *   Numeros e objetos sao alocados de maneira diferente na menoria, portanto se deve usar o metodo equals() para ocmpara-los.
        *   Number and objects are alocated in a differente way in memory, thus you have to use the equals method() to compare them.l
        */
        String nomeUm = " GLEYSON " ;
        String nomeDois = new String ( " GLEYSON " ) ;
        System.out.println ( nomeUm.equals ( nomeDois ) ) ;

    }
}
