package exercício1;

public class Produto {

    private String nome;
    private double preco;
    public boolean adc, verifi;

    public Produto(String nome) {
        this.nome = nome;

    }

    void ad() {
        if (this.adc == true) {
            System.out.println("Adcionando o produto ao carrinho ");

        } else {
            System.out.println("Não adicionando ao carrinho");

        }

    }

    void veri() {
        if (this.verifi == true) {
            System.out.println("Verificando disponibilidade ");

        } else {
            System.out.println("Cancelando verificação");

        }

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

    void exibir() {

        System.out.println("Nome do produto: " + nome);
        System.out.println("Preço do produto: " + preco);
        System.out.println("Está adcionando ao carrinho?" + adc);
        System.out.println("Está verificando a disponbilidade? " + verifi);

    }

    public void setPreco(double preco) {
        this.preco = preco;
        if (preco >= 0) {
            System.out.println("Preço válido!");

        } else {
            System.out.println("Preço Inválido!");

        }
    }
}
