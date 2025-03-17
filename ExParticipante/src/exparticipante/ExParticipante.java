
package exparticipante;


public class ExParticipante {

  
    public static void main(String[] args) {
        Participante participante1 = new Participante("Igor");
        participante1.setEmail("Diolinda@gmail.com");
        
        
        Participante participante2 = new Participante("Mateus","diolinda@gmail","14/12/30");
        System.out.println("Participante 1: ");
        participante1.Exibir();
        System.out.println("          ");
        System.out.println("Participante 2: ");
        participante2.Exibir();
      
        
        
    }
    
}
