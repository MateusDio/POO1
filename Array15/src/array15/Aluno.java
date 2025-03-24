package array15;



class Aluno {

    String nome;
    double nota;

    
    public Aluno(String nome, double nota) {
        this.nome = nome;
        this.nota = nota;
    }

   
    public void exibirInformacoes() {
        System.out.println("Nome: " + nome + ", Nota: " + nota);
    }
}
