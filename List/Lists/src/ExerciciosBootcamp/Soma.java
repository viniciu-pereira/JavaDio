package ExerciciosBootcamp;
import java.util.Scanner;

public class Soma {
    public static void main(String[] args) {
        int A, N;

        Scanner input = new Scanner(System.in);
        A = input.nextInt();
        N = input.nextInt();

        int res = 0;
        // TODO: Retorne o valor da soma de todos múltiplos de "A" até o seu limite "N".

        for(int i = 0; i <= N; i++){
            if(i % A == 0 || i % N == 0){
                res += i;
            }
        }
        System.out.println(res);
    }
}