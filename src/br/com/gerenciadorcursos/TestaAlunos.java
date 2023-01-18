package br.com.gerenciadorcursos;

import java.util.HashSet;
import java.util.Set;

public class TestaAlunos {

    public static void main(String[] args) {
        Set<String> alunos = new HashSet<>();
        alunos.add("joão");
        alunos.add("maria");
        alunos.add("luiza");
        alunos.add("matheus");

        System.out.println(alunos);

        boolean anaEstaMatriculada = alunos.contains("ana");

        System.out.println(anaEstaMatriculada);

        alunos.remove("joão");
        System.out.println(alunos);

        alunos.forEach(aluno -> {
            System.out.println(aluno);
        });

        /* A utilização do Set (que se assemelha a um conjunto matemático), possui algumas vantagens:
        *  unicidade dos elementos e velocidade de performance*/

    }
}
