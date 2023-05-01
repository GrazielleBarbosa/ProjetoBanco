
public class Conta {
    private int numeroConta;
    private String titular;
    private float saldo;
    
    public void setNumeroConta(int n) {
        this.numeroConta = n;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }
    
    public int getNumeroConta() {
        return this.numeroConta;
    }
    
    public boolean depositar(float valor) {
        //saldo = saldo + valor;
        if (valor > 0) {
            saldo += valor;
            return true;
        }
        else
            return false;
    }
    
    public boolean sacar(float valor) {
        if (valor < saldo) {
            saldo -= valor;
            return true;
        }
        else
            return false;
    }
    
    public boolean transferir(Conta contaDestino, float valor) {
        boolean sucessoSaque = this.sacar(valor);
        if (sucessoSaque)
            return contaDestino.depositar(valor);
        else
            return false;
    }

    public void gerarTaxa() {
        System.out.println("Gerar taxa default.");
    }
}
