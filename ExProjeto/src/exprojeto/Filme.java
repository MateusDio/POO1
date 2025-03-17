
package exprojeto;


public class Filme extends Projeto {
    int duracaoMinutos;
    
    
      public Filme(String titulo, String dataInicio, int duracaoMinutos, double orcamento) {
        super(titulo, dataInicio,orcamento);
        this.duracaoMinutos = duracaoMinutos;
    }
      
      @Override
      public int calcularPrazo(){
          return duracaoMinutos / 10;
      }
}
