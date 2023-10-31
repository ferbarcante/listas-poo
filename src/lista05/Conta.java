package lista05;

public class Conta {
    private long numeroDaConta;
    private String nomeDoCorretista;
    private double saldo;

    public Conta(int numeroDaConta, String nomeDoCorretista, double saldo) {
        this.numeroDaConta = numeroDaConta;
        this.nomeDoCorretista = nomeDoCorretista;
        this.saldo = saldo;
    }
    public String getNomeDoCorretista() {
        return nomeDoCorretista;
    }

    public void setNomeDoCorretista(String nomeDoCorretista) {
        this.nomeDoCorretista = nomeDoCorretista;
    }

    public long getNumeroDaConta() {
        return numeroDaConta;
    }

    public void setNumeroDaConta(long numeroDaConta) {
        this.numeroDaConta = numeroDaConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void deposito(double deposito){
        this.saldo += deposito;
    }

    public void saque(double saque){
        this.saldo -= saque ;
    }
}
