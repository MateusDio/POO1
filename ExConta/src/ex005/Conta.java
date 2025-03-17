package ex005;

public class Conta {

    public String titular;
    public int numconta;
    private double saldo;
    boolean sacar, depositar;

    public Conta(int numconta, String titular) {
        this.numconta = numconta;
        this.titular = titular;
        saldo = 0;

    }

    public int getNumconta() {
        return numconta;

    }

    public void setNumconta(int numconta) {
        this.numconta = numconta;

    }

    public void exibirSaldo() {
        System.out.println("Saldo inicial: " + saldo);

    }

    public String getTitular() {
        return this.titular;

    }

    public double getSaldo() {
        return saldo;

    }

    public void setTitular(String titular) {
        this.titular = titular;

    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;

    }

    public void depositar(double valordeposito) {
        saldo += valordeposito;
        System.out.println("Saldo atualizado: " + saldo);

    }

    public void sacar(double valorsaque) {
        saldo -= valorsaque;
        if (saldo >= valorsaque) {
            System.out.println("Saldo restante: " + saldo);

        } else {
            System.out.println("Saldo Insuficiente!!!!!!!!!!!!!");

        }

    }

    public void Exibir() {
        System.out.println("Titular da conta? " + titular);
        System.out.println("Qual o saldo atual? " + saldo);

    }
}
