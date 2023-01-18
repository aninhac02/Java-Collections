package br.com.gerenciadorcursos;

import java.util.Set;
import java.util.TreeSet;

public class TestaRecibo {

    public static void main(String[] args) {
        Recibo rec1 = new Recibo("ana", 253.40);
        Recibo rec2 = new Recibo("caroline", 253.40);
        Recibo rec3 = new Recibo("matheus", 253.40);

        Set<Recibo> recibos = new TreeSet<>();
        recibos.add(rec1);
        recibos.add(rec2);
        recibos.add(rec3);

    }
}
