
package DTO;


public class ProdutoDTO {
    String nome;
    double preco;
    int quant;

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public int getQuant() {
        return quant;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void setQuant(int quant) {
        this.quant = quant;
    }

    public ProdutoDTO(String nome, double preco, int quant) {
        this.nome = nome;
        this.preco = preco;
        this.quant = quant;
    }

    public ProdutoDTO() {
    }

    @Override
    public String toString() {
        return "ProdutoDTO{" + "nome=" + nome + ", preco=" + preco + ", quant=" + quant + '}';
    }
    
}
