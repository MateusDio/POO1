package exequipamento;

public class ExEquipamento {

    public static void main(String[] args) {
        Bicicleta bici = new Bicicleta("Bici", 70, "Corridas");
        Bola bola = new Bola("Fute", 23, "Futebol");

        System.out.println("Durabilidade da " + bici.getNome() + ": " + bici.definirDurabilidade() + " horas");
        System.out.println("Durabilidade da " + bola.getNome() + ": " + bola.definirDurabilidade() + " horas");

    }

}
