import java.util.Scanner;

public class Repeticao1 {
    
    /*
     * Faça um programa que leia conjuntos de dois valores,
     * o primeiro representanto o nome do aluno e o segundo representanto sua idade
     * O progama para quando é inserido o vlaor 0
     */

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        String nome;
        int idade;
        int limite;

        while(true){
        System.out.println("Insira o nome:");
        nome = scan.next();
        if (nome.equals("0")) break;

        System.out.println("Insira a idade:");
        idade = scan.nextInt();
        if (idade == 0) break;
        
        }
     }

}
