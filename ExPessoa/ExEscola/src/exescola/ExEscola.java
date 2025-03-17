
package exescola;


public class ExEscola {

    
    public static void main(String[] args) {
       Curso c1 = new Curso("Mateus","Rua asdnbw",60);
       c1.ExibirInformacoes();
       c1.CalcularMensalidade();
       CursoTecnico c2 = new CursoTecnico("Lucas","Rua safd",70,"Online");
       c2.ExibirInformacoes();
       c2.CalcularMensalidade();
    }
    
}
