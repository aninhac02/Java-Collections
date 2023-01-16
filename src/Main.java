import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        String aula1 = "Modelando a classe Aula";
        String aula2 = "Conhecendo mais de listas";
        String aula3 = "Trabalhando com Cursos e Sets";

        ArrayList<String> aulas = new ArrayList<>();
        aulas.add(aula1);
        aulas.add(aula2);
        aulas.add(aula3);

        System.out.println(aulas);

        //removendo elementos
        aulas.remove(0);
        System.out.println(aulas);

        //percorrendo uma lista
        for (String aula : aulas) {
            System.out.println("Aula: " + aula);
        }

        //percorrendo uma lista com lambda
        aulas.forEach(aula -> {
            System.out.println("Percorrendo:");
            System.out.println("Aula " + aula);
        });
    }
}