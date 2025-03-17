
package exlivro;

public class ExLivro {

    
    public static void main(String[] args) {
         Livro livro = new Livro("Biblioteca da Meia-Noite", "Matt Haig");
        System.out.println("Livro: " + livro.getTitulo() + ", Disponível: " + livro.getDisponivel());
        livro.Emprestar();
        System.out.println("Após empréstimo: " + livro.getDisponivel());
        livro.Devolver();
        System.out.println("Após devolução: " + livro.getDisponivel());
    }
    
}
