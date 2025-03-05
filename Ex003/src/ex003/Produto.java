package ex003;

public class Produto {

    public String nome;
    double preco;
    int quantidade;

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
        quantidade = 0;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;

    }

    public void aumentar(int aumentar) {
        quantidade += aumentar;
        System.out.println("Quantidade atualizada (aumentada): " + quantidade);

    }

    public void diminuir(int diminuir) {
        quantidade -= diminuir;
        System.out.println("Quantidade atualizada(diminuída): " + quantidade);

    }

    public void Exibir() {
        System.out.println("Nome: " + nome);
        System.out.println("Preco: " + preco);
        System.out.println("Quantidade: " + quantidade);
    }
}
