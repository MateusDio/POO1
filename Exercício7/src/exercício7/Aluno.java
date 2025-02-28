package exercício7;

public class Aluno extends Pessoa {

    public Aluno(int idade) {
        this.idade = idade;

    }

    public int getIdade() {
        return idade;

    }

    public void setIdade(int idade) {
        this.idade = idade;

    }
    
    void Exibir(){
        System.out.println("A idade do aluno é: " + idade + " anos");
        
        
    }

}
