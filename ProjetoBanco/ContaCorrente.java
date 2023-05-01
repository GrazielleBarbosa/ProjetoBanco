
public class ContaCorrente extends Conta {
    private float taxa = 10.40f;

    @Override
    public void gerarTaxa() {
        super.gerarTaxa();
        setSaldo(getSaldo()-taxa);
    }
    
    
}
