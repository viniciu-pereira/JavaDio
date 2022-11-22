import java.util.*;

public class NumerosIguais {

    public static void main(String[] args) {

        //TODO: Imprima se os valores numéricos passados são iguais ou não.
      
      Scanner scan = new Scanner(System.in);
      
      int num1 = scan.nextInt();
      int num2 = scan.nextInt();
      
      if(num1 == num2){
        System.out.println("São iguais!");
      }else{
        System.out.println("Não são iguais!");
      }
    }
}