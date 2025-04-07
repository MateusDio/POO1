
package DTO;


public class TarefasDTO {
    String titulo,descricao;
    int prazo;

    public String getTitulo() {
        return titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public int getPrazo() {
        return prazo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setPrazo(int prazo) {
        this.prazo = prazo;
    }

    public TarefasDTO(String titulo, String descricao, int prazo) {
        this.titulo = titulo;
        this.descricao = descricao;
        this.prazo = prazo;
    }

    @Override
    public String toString() {
        return "TarefasDTO{" + "titulo=" + titulo + ", descricao=" + descricao + ", prazo=" + prazo + '}';
    }
    
}
