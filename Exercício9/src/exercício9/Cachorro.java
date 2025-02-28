
package exercício9;

public class Cachorro extends Animal {

    public Cachorro() {
        this.especie = "Canino";

    }

    public void latir() {
emitirSom();
        System.out.println("O cachorro está latindo");
    }
    public void exibir (){
        System.out.println("Espécie: " + especie);
        
        
    }
}
