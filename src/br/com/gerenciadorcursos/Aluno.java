package br.com.gerenciadorcursos;

public class Aluno {

    private String nome;
    private int numMatricula;

    public Aluno(String nome, int numMatricula) {
        this.nome = nome;
        this.numMatricula = numMatricula;
    }

    public String getNome() {
        return nome;
    }

    public int getNumMatricula() {
        return numMatricula;
    }

    @Override
    public String toString() {
        return "{" +
                "nome='" + nome + '\'' +
                ", numMatricula=" + numMatricula +
                '}';
    }
}
