package exescola;

public class Escola {

    protected String nome;
    protected int endereco;

    public Escola(String nome, int endereco) {
        this.endereco = endereco;
        this.nome = nome;

    }

    public String getNome() {
        return nome;

    }

    public void setNome(String nome) {
        this.nome = nome;

    }

    public int getEndereco() {
        return endereco;

    }

    public void setEndereco(int endereco) {
        this.endereco = endereco;

    }
}
