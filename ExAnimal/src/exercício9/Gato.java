
package exercício9;

public class Gato extends Animal {

    public Gato() {
        this.especie = "Felino";

    }

    public void miar() {
emitirSom();
        System.out.println("O gato está miando");
    }
    public void exibir (){
        System.out.println("Espécie: " + especie);
        
        
    }
}
