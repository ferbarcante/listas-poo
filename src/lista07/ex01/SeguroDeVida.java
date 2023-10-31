package lista07.ex01;

public class SeguroDeVida extends Conta implements Tributavel{
    public SeguroDeVida(double saldo) {
        super(saldo);
    }

    @Override
    public double calculaTributo() {
        return 42.00;
    }
}
