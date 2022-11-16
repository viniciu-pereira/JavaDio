import java.util.Scanner;

public class Repeticao3 {
    
    /*  
     * Faça um programa que leia 5 numeros
     * Informe o maior numero
     * Informe a media desses numeros
     */

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        int numero;
        int count = 0;
        int maior = 0;
        int soma = 0;
        int media = 0;

        do{

            System.out.println("Digite o numero:");
            numero = scan.nextInt();

            if(numero > maior) maior = numero;

            soma += numero;

            count++;

        }while(count < 5);

        media = soma / 5;

        System.out.println("Maior: " + maior);
        System.out.println("Media: " + media);

    }
}
