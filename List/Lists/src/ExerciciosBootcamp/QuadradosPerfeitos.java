package ExerciciosBootcamp;

import java.util.Scanner;

public class QuadradosPerfeitos {
    public static void main(String[] args) {

        int n = Integer.parseInt(new Scanner(System.in).nextLine());
        int menorNumero = 0;
        int maxQuad = (int) Math.sqrt(n);
        int nAuxiliar = n;

        for (int i = maxQuad; i > 0; i--) {
            int quad = i * i;
            if (quad == n) {
                menorNumero = 1;
                break;
            }
            if (quad * 3 == n) {
                menorNumero = 3;
                break;
            }
            if (quad <= nAuxiliar) {
                if (nAuxiliar == 3) {
                    menorNumero += 3;
                    break;
                } else {
                    menorNumero++;
                    nAuxiliar -= quad;
                }
            }
        }
        
        System.out.println(menorNumero);
    }
}