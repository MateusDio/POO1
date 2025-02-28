package exercício8;

public class Porta {

    private boolean aberta;

    public Porta(boolean aberta) {
        this.aberta = aberta;

    }

    public boolean getAberta() {
        return aberta;

    }

    public void setAberta(boolean aberta) {
        this.aberta = aberta;

    }

    public void abrir() {
       if( aberta == true){
           System.out.println("A porta está aberta");
    }else{
           System.out.println(" ");
           
       }
       
       
    }

   public void fechar() {
       if( aberta == false){
           
           System.out.println("A porta está Fechada");
           
    }else{
           System.out.println(" ");
           
       }
   }

    void Exibir() {
        System.out.println(aberta);
    }

}
