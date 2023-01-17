package br.com.gerenciadorcursos;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestaCurso2 {

    public static void main(String[] args) {

        Curso javaCollections = new Curso("Dominando as coleções", "Paulo");

        javaCollections.adiciona(new Aula("Trabalhando com ArrayList",21));
        javaCollections.adiciona(new Aula("Criando uma ArrayList",22));
        javaCollections.adiciona(new Aula("Modelando com coleções",23));

        List<Aula> aulasImutaveis = javaCollections.getAulas();
        System.out.println(aulasImutaveis);

        List<Aula> aulas = new ArrayList<>(aulasImutaveis);

        Collections.sort(aulas);
        System.out.println(aulas);

        System.out.println(javaCollections.getTempoTotal());

        System.out.println(javaCollections);

    }
}
