package OrdenandoLists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

//**************************************************************************************** */
public class ExemploOrdenacao {
    
    public static void main(String[] args) {
        
        List<Gato> meusGatos = new ArrayList<Gato>(){{
            add(new Gato("Jon", "preto", 18));
            add(new Gato("Simba", "branco", 12));
            add(new Gato("Jon", "laranja", 10));

        }};
        System.out.println("------------ Ordem normal: ------------");
        System.out.println(meusGatos);

        System.out.println("\n------------ Ordem de Inseerção: ------------");
        System.out.println(meusGatos + "\n");

        System.out.println("------------ ORdem aleatória: ------------");
        Collections.shuffle(meusGatos);
        System.out.println(meusGatos);

        System.out.println("\n------------Ordem natural: ------------");
        Collections.sort(meusGatos);
        System.out.println(meusGatos);

        System.out.println("\n------------Ordem Idade: ------------");
        Collections.sort(meusGatos, new ComparatorIdade());
        meusGatos.sort(new ComparatorIdade());
        System.out.println(meusGatos);

        System.out.println("\n------------Ordem por cor: ------------");
        meusGatos.sort(new ComparatorCor());
        System.out.println(meusGatos);

        System.out.println("\n------------Ordem por Nome/COr/Idade: ------------");
        meusGatos.sort(new ComparatorNomeCorIdade());
        System.out.println(meusGatos);

    }
}

//**************************************************************************************** */
class Gato implements Comparable<Gato>{
    private String nome;
    private String cor;
    private Integer idade;

    public Gato(String nome, String cor, Integer idade) {
        this.nome = nome;
        this.cor = cor;
        this.idade = idade;
    }

    public Integer getIdade() {
        return idade;
    }

    public String getCor() {
        return cor;
    }

    public String getNome() {
        return nome;
    }

    //Metodo toString para exibir a lista ao inves do endereço de memoria
    @Override
    public String toString() {
        return "{" + 
                "nome='" + nome + '\'' + 
                ", idade=" + idade + 
                ", cor='" + cor + '\'' + 
                '}';
    }

    //Metodo comareTo para comparar strings e retornar um int
    @Override
    public int compareTo(Gato gato){
        return this.getNome().compareToIgnoreCase(gato.getNome());
    }
}

//**************************************************************************************** */
class ComparatorIdade implements Comparator<Gato>{

    @Override
    public int compare(Gato g1, Gato g2){
        return Integer.compare(g1.getIdade(), g2.getIdade());
    }
}

//**************************************************************************************** */
class ComparatorCor implements Comparator<Gato>{
    @Override
    public int compare(Gato g1, Gato g2){
        return g1.getCor().compareToIgnoreCase(g2.getCor());
    }
}

//**************************************************************************************** */
class ComparatorNomeCorIdade implements Comparator<Gato>{
    
    @Override
    public int compare(Gato g1, Gato g2){
        
        int nome = g1.getNome().compareToIgnoreCase(g2.getNome());

        if( nome != 0){
            return nome;
        }

        int cor = g1.getCor().compareToIgnoreCase(g2.getCor());
        if(cor != 0){
            return cor;
        }
        return Integer.compare(g1.getIdade(), g2.getIdade());
    }
}