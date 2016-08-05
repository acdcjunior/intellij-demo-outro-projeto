package br.gov.tcu.bbt.outro.dica101;

import java.util.List;

import static java.util.Arrays.asList;

@SuppressWarnings("ALL")
public class AlterandoListas {

    public void meuMetodo(String nome, int idade, boolean brasileiro) {
        List<Long> longs = asList(888L, 111L, 333L, 444L, 999L, 555L, 666L, 777L, 222L);
        System.out.println(longs);
    }

    public void usandoMeuMetodo() {
        meuMetodo("João", 40, true);
    }

    public void usingMyMethod() {
        meuMetodo("John", 50, false);
    }

}
