package HerancaExercicios.Exercicio1;

public class ExecutarAplicacao {
    
    public static void main(String[] args) {
        
        Funcionario funcionario = new Funcionario();
        Funcionario gerente = new Gerente();
        Funcionario vendedor = new Vendedor();
        Funcionario faxineiro = new Faxineiro();

        //Gerente gerente = new Funcionario();
        Vendedor vendedor_ = (Vendedor) new Funcionario(); 
    }
}

