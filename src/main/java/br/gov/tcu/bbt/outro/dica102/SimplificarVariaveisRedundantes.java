package br.gov.tcu.bbt.outro.dica102;

import br.gov.tcu.bbt.outro.Exemplo;

/**
 * - Warning no null
 * - Remove o null via alt+enter
 * - Join declaration and assignment via alt+enter
 * - Dah warning na variavel inutil
 * - Alt+enter junta tudo
 */
public class SimplificarVariaveisRedundantes {

    public String fazAlgumaCoisaComExemplo(Exemplo exemplo) {
        String paginarDestino = null;
        paginarDestino = fazOutraCoisaComExemplo(exemplo);
        return paginarDestino;
    }

    private String fazOutraCoisaComExemplo(Exemplo exemplo) {
        return exemplo.toString();
    }

}
