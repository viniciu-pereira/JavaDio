import java.util.Scanner;

public class Fatorial {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        System.out.println("insira o valor a ser calculado o fatorial: ");
        
        int numero = scan.nextInt();
        int fatorial = 1;

        for(int i = numero; i >= 1; i--) {
            fatorial *= i;
        }

        System.out.println("Fatorial: " + fatorial);
    }
}
