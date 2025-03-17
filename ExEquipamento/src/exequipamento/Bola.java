package exequipamento;

public class Bola extends Equipamento {

    private String material;

    public Bola(String nome, double precoAluguel, String material) {
        super(nome, precoAluguel);
        this.material = material;
    }

    @Override
    public int definirDurabilidade() {
        return 20;

    }

}
