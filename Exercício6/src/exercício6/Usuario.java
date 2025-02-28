package exercício6;

public class Usuario {

    private String login, senha;

    public Usuario(String login, String senha) {
        this.login = login;
        this.senha = senha;

    }

    public String getLogin() {
        return login;

    }

    public String getSenha() {
        return senha;

    }

    public void setLogin(String login) {
        this.login = login;

    }

    public void setSenha(String senha) {
        this.senha = senha;

    }

    public void autenticar(String Login, String Senha) {
        if (login == Login) {

            System.out.println("Login correto!");

        } else {
            System.out.println("Login Incorreto!!!!!!!!!!");
        }
        if (senha == Senha) {
            System.out.println("Senha correta!");
        } else {

            System.out.println("Senha incorreta!");

        }
    }
    void exibir(){
        System.out.println("Login: " + login);
        System.out.println("Senha: " + senha);
        
    }
}
