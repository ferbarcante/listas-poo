package lista05;

public class ContaEspecial extends Conta {
    private double limite;

    public ContaEspecial(int numeroDaConta, String nomeDoCorretista, double saldo, double limite) {
        super(numeroDaConta, nomeDoCorretista, saldo); // Chamando o construtor da classe base
        this.limite = limite;
    }

    public void saque(double valor) {
        if (valor > 0 && valor <= (this.getSaldo() + this.limite)) {
            double novoSaldo = this.getSaldo() - valor;
            this.setSaldo(novoSaldo);
            System.out.println("Saque de R$" + valor + " realizado com sucesso.");
        } else {
            System.out.println("Saldo insuficiente ou valor inválido.");
        }
    }

}
