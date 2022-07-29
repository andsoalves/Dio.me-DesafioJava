package pacote1;

public class Main {
    public static void main(String[] args) {
        Conta cc = new ContaCorrente();
        Conta poup = new ContaPoupanca();
        Conta cc2 = new ContaCorrente();
        Conta cc3 = new ContaCorrente();
        //Conta cc4 = new ContaCorrente();

        cc.depositar(100);
        cc2.depositar(100);
        cc.transferir(50,poup);

       cc.imprimirExtrato();
       poup.imprimirExtrato();
       poup.listarContas();
       cc.listarContas();
       Banco.listarNumero();
    }


}
