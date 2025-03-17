package ex004;

public class Retangulo {

    public double altura, largura;

    public Retangulo(double altura, double largura) {
        this.altura = altura;
        this.largura = largura;

    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getLargura() {
        return largura;
    }

    public void setLargura(double largura) {
        this.largura = largura;
    }

    public void Area() {
        double area1;
        area1 = largura * altura / 2;
        System.out.println("A Àrea é: " + area1);

    }
    
    public void Exibir(){
        System.out.println("Altura: " + altura);
        System.out.println("Largura: " + largura);
        
        
    }

}
