package br.gov.tcu.bbt.outro;

import br.gov.tcu.bbt.outro.usuario.UsuarioDoOutroProjeto;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class ExemploTest {

    @Test
    public void meuTeste() throws Exception {
        assertThat(UsuarioDoOutroProjeto.getNomeUsuarioDoOutroProjeto(), is("Nada não."));
    }

}