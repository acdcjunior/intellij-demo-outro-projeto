package br.gov.tcu.bbt.outro.dica020;

@SuppressWarnings("ALL")
public class RenomeandoPropriedades {

    private int idade;
    private String nome;
    private String cep;

    public RenomeandoPropriedades(int idade, String nome, String cep) {
        this.idade = idade;
        this.nome = nome;
        this.cep = cep;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

}
