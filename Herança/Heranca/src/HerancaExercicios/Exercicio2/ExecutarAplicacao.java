package HerancaExercicios.Exercicio2;

public class ExecutarAplicacao {
    
    public static void main(String[] args) {
        
        ClasseMae[] classses = new ClasseMae[]{new ClasseFilha1(), new ClasseFilha2(), new ClasseMae()};
    
        for (ClasseMae classe : classses) {
            classe.metodo1();
        }

        System.out.println("");

        for (ClasseMae classe : classses) {
            classe.metodo2();
        }   

        System.out.println("");

        ClasseFilha2 classeFilha2 = new ClasseFilha2();
        classeFilha2.metodo2();
    }
}
