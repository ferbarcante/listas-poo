package lista02;

public class ProgressaoAritmetica {
    private int primeiroTermo;
    private int razao;
    private int termoAtual;

    public ProgressaoAritmetica(int razao, int primeiroTermo) {
        this.razao = razao;
        this.primeiroTermo = primeiroTermo;
    }

    public int proximoTermo(){
        primeiroTermo = primeiroTermo + razao;
        termoAtual = primeiroTermo;

        return termoAtual;
    }

    public int getPrimeiroTermo() {
        return primeiroTermo;
    }

    public void setPrimeiroTermo(int primeiroTermo) {
        this.primeiroTermo = primeiroTermo;
    }

    public int getRazao() {
        return razao;
    }

    public void setRazao(int razao) {
        this.razao = razao;
    }
}
