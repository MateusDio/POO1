package exescola;

public abstract class Escola {

    protected String nome;
    protected String endereco;

    public Escola(String nome, String endereco) {
        this.endereco = endereco;
        this.nome = nome;

    }

    public String getNome() {
        return nome;

    }

    public void setNome(String nome) {
        this.nome = nome;

    }

    public String getEndereco() {
        return endereco;

    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;

    }
    public abstract int CalcularMensalidade();
}
