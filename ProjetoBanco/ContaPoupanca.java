
public class ContaPoupanca extends Conta {
    private float juros = 0.005f;

    @Override
    public void gerarTaxa() {
        float calcJuros = getSaldo() * juros;
        setSaldo(getSaldo() + calcJuros);
    }
    
    
}
