package br.com.gerenciadorcursos;

/*
* Para adicionarmos um objeto em um TreeSet ele precisa implementar a interface Comparable.
* Mas o que fazer se estamos trabalhando com uma instância de uma classe que não temos acesso ou não podemos modificar para implementar Comparable?
* Nesse caso, o construtor do TreeSet recebe como parâmetro um objeto que implementa Comparator. Dessa forma, o critério de comparação pode ser criado
* em separado da classe na qual opera.
* */
public class Recibo implements Comparable<Recibo> {

    private String nomeCliente;
    private Double valor;

    public Recibo(String nomeCliente, Double valor) {
        this.nomeCliente = nomeCliente;
        this.valor = valor;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public Double getValor() {
        return valor;
    }

    @Override
    public int compareTo(Recibo o) {
        return 0;
    }
}
