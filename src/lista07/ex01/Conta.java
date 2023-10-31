package lista07.ex01;

public class Conta {
    protected double saldo;

    public Conta(double saldo) {
        this.saldo = saldo;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void sacar(double valor){
        this.saldo -=valor;
    }

    public void depositar(double valor){
        this.saldo+=valor;
    }

    public double obterSaldo(){
        return this.saldo;
    }
}
