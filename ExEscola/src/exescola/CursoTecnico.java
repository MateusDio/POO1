
package exescola;


public class CursoTecnico extends Curso {
    protected String modalidade;
    
    public CursoTecnico (String nome, int endereco, int cargaHoraria, String modalidade){
        super (nome,endereco,cargaHoraria);
        this.modalidade = modalidade;
        
    }
    
    @Override
      void ExibirInformacoes(){
        ExibirInformacoes();
        System.out.println("Nome:" + nome);
        System.out.println("Endereço: " + endereco);
        System.out.println("Carga Horária: " + cargaHoraria);
        System.out.println("Modalidade: " + modalidade);
        
    }
}
