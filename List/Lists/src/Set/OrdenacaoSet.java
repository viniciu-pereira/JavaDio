package Set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class OrdenacaoSet {
    public static void main(String[] args) {

        System.out.println("\n------------Ordem aleatória: ------------");
        Set<Serie> minhasSeries = new HashSet<Serie>() {
            {
                add(new Serie("got", "fantasia", 60));
                add(new Serie("dark", "drama", 50));
                add(new Serie("wow", "fantasia", 20));

            }
        };

        for (Serie serie : minhasSeries)
            System.out.println(serie.getNome() + "-" + serie.getGenero() + " - " + serie.getTempoEpisodio());

        System.out.println("\n------------Ordem de inserção: ------------");
        Set<Serie> minhasSeries1 = new LinkedHashSet<Serie>(){{
            add(new Serie("got", "fantasia", 60));
            add(new Serie("dark", "drama", 50));
            add(new Serie("wow", "fantasia", 20));
        }};
        for(Serie serie : minhasSeries1) System.out.println(serie.getNome() + "-" + serie.getGenero() + "-" + serie.getTempoEpisodio());

    }
}

class Serie {
    private String nome;
    private String genero;
    private Integer tempoEpisodio;

    public Serie(String nome, String genero, Integer tempoEpisodio) {
        this.nome = nome;
        this.genero = genero;
        this.tempoEpisodio = tempoEpisodio;
    }

    public String getNome() {
        return nome;
    }

    public String getGenero() {
        return genero;
    }

    public Integer getTempoEpisodio() {
        return tempoEpisodio;
    }

    @Override
    public String toString() {
        return "{" +
                "nome='" + nome + '\'' +
                ", genero=" + genero +
                ", tempoEpisodio='" + tempoEpisodio + '\'' +
                '}';
    }
}
