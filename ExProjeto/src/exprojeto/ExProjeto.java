
package exprojeto;


public class ExProjeto {

    
    public static void main(String[] args) {
       Filme film = new Filme("Vingadores","12/11/2012",120,1200000);
       Musica music = new Musica("One", "12/2/2007",50, 10000);
       
 

        
        System.out.println("Prazo do projeto 'Filme' '" + film.getTitulo() + "': " + film.calcularPrazo() + " dias");
        System.out.println("Prazo do projeto 'Música' '" + music.getTitulo() + "': " + music.calcularPrazo() + " dias");
    }
}

    
    

