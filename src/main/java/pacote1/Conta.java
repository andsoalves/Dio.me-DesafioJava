package pacote1;

public abstract class Conta implements InterConta {
    protected int agencia;
    protected int numero;
    protected int saldo;

    public static int getSEQUENCIAL() {
        return SEQUENCIAL;
    }

    private static int SEQUENCIAL = 1;
    private  static final int AGENCIA_PADRAO = 1;

    public Conta () {
        this.agencia = Conta.AGENCIA_PADRAO;
        this.numero = Conta.SEQUENCIAL++;
    }


    public void sacar(double valor) {
        this.saldo -= valor;

    }

    @Override
    public void depositar(double valor) {
        this.saldo +=valor;

    }

    @Override
    public void transferir(double valor, Conta contaDestino) {
        this.sacar(valor);
        contaDestino.depositar(valor);

    }

    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    public int getSaldo() {
        return saldo;
    }

    protected void imprimirInfosComuns() {
        System.out.println(String.format("Agencia : %d", getAgencia()));
        System.out.println(String.format("numero : %d", getNumero()));
        System.out.println(String.format("Saldo : %d", getSaldo()));
    }

    public static void listarContas() {
        System.out.println("A Quantidade de Contas Ativas é " + (getSEQUENCIAL()));
    }
}
