package exparticipante;

public class Participante {

    String nome;
    String email;
    String dataInscricao;

    public Participante(String nome) {
        this.nome = nome;
        this.dataInscricao = "12/03/2025";

    }

    public Participante(String nome, String email, String dataInscricao) {
        this.nome = nome;
        this.email = email;
        this.dataInscricao = dataInscricao;

    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public String getData() {
        return dataInscricao;
    }
    
     public void setEmail(String email) {
        if (email.contains("@")) {
            this.email = email;
        } else {
            System.out.println("Email inválido. O email deve conter '@'.");
        }
    }

  

    void Exibir() {
        System.out.println("Nome: " + nome);
        System.out.println("Email: " + email);
        System.out.println("Data de Inscrição: " + dataInscricao);

    }
}
