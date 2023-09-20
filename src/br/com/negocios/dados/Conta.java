public class Conta {
    private String nome;
    private int numeroDaConta;
    private double saldo;

    public void exibaFicha() {
        System.out.println("Seja Bem-Vindo, " + nome + "!");
        System.out.println("Conta: " + numeroDaConta);
        System.out.println("Saldo: R$" + saldo);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNumeroDaConta() {
        return numeroDaConta;
    }

    public void setNumeroDaConta(int numeroDaConta) {
        this.numeroDaConta = numeroDaConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
