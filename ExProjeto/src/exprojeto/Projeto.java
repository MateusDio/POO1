package exprojeto;

public abstract class Projeto {

    private String titulo;
    private String dataInicio;
    private double orcamento;

    public Projeto(String titulo, String dataInicio, double orcamento) {
        this.dataInicio = dataInicio;
        this.orcamento = orcamento;
        this.titulo = titulo;

    }

    public String getTitulo() {
        return titulo;

    }

    public String getDataInicio() {
        return dataInicio;

    }

    public double getOrcamento() {
        return orcamento;

    }

    public void setOrcamento(double orcamento) {
        this.orcamento = orcamento;

    }

    public abstract int calcularPrazo();
}
