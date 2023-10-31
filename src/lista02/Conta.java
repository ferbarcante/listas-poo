package lista02;

public class Conta {
    private long numeroDaConta;
    private String nomeDoCorretista;
    private double saldo;

    public String getNomeDoCorretista() {
        return nomeDoCorretista;
    }

    public void setNomeDoCorretista(String nomeDoCorretista) {
        this.nomeDoCorretista = nomeDoCorretista;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public long getNumeroDaConta() {
        return numeroDaConta;
    }

    public void setNumeroDaConta(long numeroDaConta) {
        this.numeroDaConta = numeroDaConta;
    }

   public void saque(double valorDoSaque) {
        this.saldo = saldo - valorDoSaque;
    }

    public void deposito(double valorDeposito){
        this.saldo = saldo + valorDeposito;
    }
}
