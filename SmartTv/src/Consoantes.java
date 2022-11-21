import java.util.Scanner;

public class Consoantes {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        String[] consoantes = new String[6];
        int quantidadeConsoantes = 0;
        int count = 0;

        do {

            System.out.println("Letras: ");
            String letra = scan.next();

            if ( !(letra.equalsIgnoreCase("a") |
                    letra.equalsIgnoreCase("e") |
                    letra.equalsIgnoreCase("i") |
                    letra.equalsIgnoreCase("o") |
                    letra.equalsIgnoreCase("u"))){

                consoantes[count] = letra;
                quantidadeConsoantes++;
            }

            count++;

        }while(count < consoantes.length);

        //para cada elemento dentro do vetor de consoantes, a variavel consoante é usada como apoio para a leitura.
        System.out.println("\nConsoantes: ");

        //For it
        for (String consoante : consoantes){

            if(consoante != null){
                System.out.println(consoante + " ");
            }
            System.out.println("Quantidade de consoantes: " + quantidadeConsoantes);
        }
    }
}
