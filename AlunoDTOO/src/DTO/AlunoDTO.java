
package DTO;


public class AlunoDTO {
    String nome, curso;
    int matricula;

    @Override
    public String toString() {
        return "AlunoDTO{" + "nome=" + nome + ", curso=" + curso + ", matricula=" + matricula + '}';
    }

    public AlunoDTO(String nome, String curso, int matricula) {
        this.nome = nome;
        this.curso = curso;
        this.matricula = matricula;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public String getCurso() {
        return curso;
    }

    public int getMatricula() {
        return matricula;
    }
}
