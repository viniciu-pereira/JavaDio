import java.util.Random;

public class Matriz {
 
    public static void main(String[] args) {
        
    /*
     * Gere uma matriz de 4x4 com numeros aleatorios entre 0-9
     */

    Random random = new Random();
        
        //Declarando matriz
        int[][] Matriz = new int[4][4]; 

        for(int i = 0; i < Matriz.length; i++) {
            for(int j = 0; j < Matriz[i].length; j++) {

                Matriz[i][j] = random.nextInt(9);
            }
        }

        System.out.println("Matriz: ");
        for( int[] linha : Matriz){
            for(int coluna : linha){
                System.out.print(coluna + " ");
            }
            System.out.println("\n");
        }
    }
}
