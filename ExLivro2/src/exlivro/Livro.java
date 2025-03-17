package exlivro;

public class Livro {

    String titulo;
    String autor;
    boolean disponivel;

    public Livro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
        this.disponivel = true;
    }

    public String getTitulo() {
        return titulo;

    }

    public String getAutor() {
        return titulo;

    }

    public boolean getDisponivel() {
        return disponivel;

    }

    public boolean Emprestar() {
        if (disponivel) {
            disponivel = false;
            return true;

        }

        return false;
    }

    public void Devolver() {
        disponivel = true;

    }

    void Exibir() {
        System.out.println("Título do livro: " + titulo);
        System.out.println("Autor do livro: " + autor);
        System.out.println("Disponibilidade do livro: " + disponivel);

    }
}
