package br.com.gerenciadorcursos;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class TesteMap {

    public static void main(String[] args) {
        Map<String, Integer> nomesParaIdade = new HashMap<>();

        nomesParaIdade.put("Paulo", 31);
        nomesParaIdade.put("Adriano", 25);
        nomesParaIdade.put("Alberto", 33);
        nomesParaIdade.put("Guilherme", 26);

        //acessar somente as chaves:
        Set<String> chaves = nomesParaIdade.keySet();
        for (String nome : chaves) {
            System.out.println(nome);
        }

        //acessar somente os valores:
        Collection<Integer> valores = nomesParaIdade.values();
        for (Integer idade : valores) {
            System.out.println(idade);
        }

        //acessar as associações:
        Set<Map.Entry<String, Integer>> associacoes = nomesParaIdade.entrySet();
        for (Map.Entry<String, Integer> associacao : associacoes) {
            System.out.println(associacao.getKey() + " - " + associacao.getValue());
        }
    }
}
