package lista07.ex01;

public class ContaCorrente extends Conta implements Tributavel{
    public ContaCorrente(double saldo) {
        super(saldo);
    }

    @Override
    public double calculaTributo() {
        return this.saldo*0.01;
    }
}
