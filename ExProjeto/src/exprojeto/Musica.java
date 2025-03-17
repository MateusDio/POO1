
package exprojeto;

public class Musica extends Projeto {
    int numeroNotas;
    
        public Musica(String titulo, String dataInicio, int numeroNotas, double orcamento) {
        super(titulo, dataInicio,orcamento);
        this.numeroNotas = numeroNotas;
    }
      
      @Override
      public int calcularPrazo(){
          return numeroNotas / 10;
      }
}
