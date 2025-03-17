package exescola;

public class Curso extends Escola {

    protected int cargaHoraria;

    public Curso(String nome, int endereco, int cargaHoraria) {

        super(nome, endereco);
        this.endereco = endereco;

    }

    public int getHora() {
        return cargaHoraria;

    }

    public void setHora(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
        if (cargaHoraria <= 0) {

            System.out.println("ERRO!!!!!!!!!!!!!!!!");
        }

    }

    void ExibirInformacoes() {

        System.out.println("Nome:" + nome);
        System.out.println("Endereço: " + endereco);
        System.out.println("Carga Horária: " + cargaHoraria);

    }
}
