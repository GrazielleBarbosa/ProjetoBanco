public class Principal {

    public static void main(String[] args) {
        ContaCorrente cCorrente = new ContaCorrente();
        cCorrente.setNumeroConta(9876540);
        cCorrente.setTitular("Grazi Barros");
        cCorrente.setSaldo(1000.00f);
        
        ContaPoupanca cPoupanca = new ContaPoupanca();
        cPoupanca.setNumeroConta(9876540);
        cPoupanca.setTitular("Grazi Barros");
        cPoupanca.setSaldo(300.00f);
        
        //System.out.println(cCorrente.toString() + " - " + cCorrente.getTitular());
        //System.out.println(cPoupanca.toString() + " - " + cPoupanca.getTitular());
        /*
        System.out.println("Conta Corrente - " + cCorrente.getTitular());
        System.out.println("Saldo: " + cCorrente.getSaldo());
        System.out.println("Depósito: " + cCorrente.depositar(100.0f));
        System.out.println("Saldo: " + cCorrente.getSaldo());
        System.out.println("Saque: " + cCorrente.sacar(2000f));
        System.out.println("Saldo: " + cCorrente.getSaldo());
        
        System.out.println("Conta Poupança - " + cPoupanca.getTitular());
        System.out.println("Saldo: " + cPoupanca.getSaldo());
        cCorrente.transferir(cPoupanca, 120f);
        System.out.println("Saldo: " + cPoupanca.getSaldo());
        
        System.out.println("Conta Corrente - " + cCorrente.getTitular());
        System.out.println("Saldo: " + cCorrente.getSaldo());*/
        
        System.out.println("Conta Corrente - " + cCorrente.getTitular());
        System.out.println("Saldo: " + cCorrente.getSaldo());
        cCorrente.gerarTaxa();
        System.out.println("Saldo: " + cCorrente.getSaldo());
        
        System.out.println("Conta Poupança - " + cPoupanca.getTitular());
        System.out.println("Saldo: " + cPoupanca.getSaldo());
        cPoupanca.gerarTaxa();
        System.out.println("Saldo: " + cPoupanca.getSaldo());

    }
    
}
