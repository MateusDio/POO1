
package ex001;


public class Carro {

    private String marca, modelo;
    public int ano;
    public double preco;

    public Carro(String marca, String modelo, int ano, double preco) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.preco = preco;

    }

    public String getMarca() {
        return marca;

    }

    public String getModelo() {
        return modelo;

    }

    public void setMarca(String marca) {
        this.marca = marca;

    }

    public void setModelo(String modelo) {
        this.modelo = modelo;

    }

    public void verificação() {
        if (ano >= 1886) {
            System.out.println("Ano correto!");

        } else{
            System.out.println("asdas");

        }

    }

    public void Exibir() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano: " + ano);
        System.out.println("Preço: " + preco);

    }
}