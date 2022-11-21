public class OrdemInversa {
    
    public static void main(String[] args) {
        
        int[] vetor = {0, 15, -5, 50, 8, 4};

        int count = 0;

        //Mostrar o vetor
        System.out.println("Ordem do vetor");
        while(count <= (vetor.length -1)){ //Não existe posição 6

            System.out.print(vetor[count] + ", ");
            count++;
        } 

        //Mostrar a ordem inversa do vetor
        System.out.println("\nOrdem inversa do vetor");
        for(int i = (vetor.length - 1); i >= 0; i-- ){

            System.out.print(vetor[i] + ", ");
        }
    }
}
