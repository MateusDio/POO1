package exercício5;

public class Funcionario {

    private String nome;
    private double salario;

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;

    }

    public String getNome() {
        return nome;

    }

    public double geSalario() {
        return salario;

    }

    public void setSalario(double salario) {
        this.salario = salario;

    }

    public void setSalario(String nome) {
        this.nome = nome;

    }
    public void Exibir(){
        System.out.println("Nome do funcionário: " + nome);
        System.out.println("Salario do funcionário: " + salario);
        
        
        
    }
}
