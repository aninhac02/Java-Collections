package br.com.gerenciadorcursos;

public class TestaCursoComAluno {

    public static void main(String[] args) {
        Curso javaCollections = new Curso("Dominando as coleções", "Paulo");

        javaCollections.adiciona(new Aula("Trabalhando com ArrayList",21));
        javaCollections.adiciona(new Aula("Criando uma ArrayList",22));
        javaCollections.adiciona(new Aula("Modelando com coleções",23));


        Aluno a1 = new Aluno("ana", 123);
        Aluno a2 = new Aluno("caroline", 456);
        Aluno a3 = new Aluno("matheus", 789);

        javaCollections.matricular(a1);
        javaCollections.matricular(a2);
        javaCollections.matricular(a3);

        System.out.println("Alunos:");
        javaCollections.getAlunos().forEach(a -> {
            System.out.println(a);
        });
    }
}
