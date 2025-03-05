package ex002;

public class Livro {

    public String titulo, autor, genero;
    public int anoPublicacao;

    public Livro(String titulo, String autor, String genero, int anoPublicacao) {
        this.titulo = titulo;
        this.autor = autor;
        this.genero = genero;
        this.anoPublicacao = anoPublicacao;

    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAno() {
        return anoPublicacao;
    }

    public void setAno(int anoPublicacao) {
        this.anoPublicacao = anoPublicacao;
    }

    public void Verificar() {
        if (genero == "Humor") {
            System.out.println("É humor!!!");

        } else if (genero == "Ficção") {
            System.out.println("É ficção!!!");

        } else if (genero == "Romance") {
            System.out.println("É romance!!!");

        } else {
            System.out.println("Gênero não registrado no sistema !!!!!");
        }

    }
    
    public void Exibir (){
        System.out.println("Autor: " + autor);
        System.out.println("Gênero: " + genero);
        System.out.println("Título: " + titulo);
        System.out.println("Ano Publicação: " + anoPublicacao);
       
        
        
        
    }

}
