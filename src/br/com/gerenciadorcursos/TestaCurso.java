package br.com.gerenciadorcursos;

import java.util.List;

public class TestaCurso {

    public static void main(String[] args) {
        Curso javaCollections = new Curso("Dominando as coleções", "Paulo");


        //javaCollections.getAulas().add(new Aula("Trabalhando com ArrayList",21));

        javaCollections.adiciona(new Aula("Trabalhando com ArrayList",21));
        javaCollections.adiciona(new Aula("Criando uma ArrayList",22));
        javaCollections.adiciona(new Aula("Modelando com coleções",23));

        System.out.println(javaCollections.getAulas());
    }
}
