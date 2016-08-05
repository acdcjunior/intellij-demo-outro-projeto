package br.gov.tcu.bbt.outro.dica010;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RenomeandoClasseComTestesTest {

    @Test
    public void retornarUm_deveRetornarUm() {
        assertEquals(1, new RenomeandoClasseComTestes().retornarUm());
    }

}