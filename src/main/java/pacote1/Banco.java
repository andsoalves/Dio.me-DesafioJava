package pacote1;

public class Banco {
    private String nome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public static void listarNumero() {
        System.out.println("Numero de Contas Ativas = " +  (Conta.getSEQUENCIAL()-1));
    }
}
