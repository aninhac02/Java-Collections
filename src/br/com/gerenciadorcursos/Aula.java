package br.com.gerenciadorcursos;

/*
 * Ao implementar a interface Comparable, a classe Aula passa a poder ser ordenada pelo método
 * sort, tal qual uma string. O parâmetro de comparação é definido na sobrescrita do método compareTo
 * */
public class Aula implements Comparable<Aula> {

    private String titulo;
    private int tempo;

    public Aula(String titulo, int tempo) {
        this.titulo = titulo;
        this.tempo = tempo;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getTempo() {
        return tempo;
    }

    @Override
    public String toString() {
        return "[Aula: " + this.titulo + ", " + this.tempo + " minutos]";
    }

    @Override
    public int compareTo(Aula outraAula) {
        return this.titulo.compareTo(outraAula.titulo);
    }
}
