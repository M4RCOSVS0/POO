package entietes;

public class Bank {
    

    private int numeroConta;
    private String nome;
    private double saldo;

    public Bank(int numeroConta, String nome, Double saldoInicial) {
        this.numeroConta = numeroConta;
        this.nome = nome;
        addSaldo(saldoInicial);
    }

    public Bank(int numeroConta, String nome) {
        this.numeroConta = numeroConta;
        this.nome = nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public int getNumeroConta() {
        return numeroConta;
    }
    public String getNome() {
        return nome;
    }
    public double getSaldo() {
        return saldo;
    }

    public void addSaldo(Double saldo){
        this.saldo += saldo;
    }

    public void sacarSaldo(Double saldo){
        this.saldo -= saldo + 5;
    }
    
    @Override
    public String toString() {
        return "Accont " + numeroConta + ", Holder: " + nome + ", Balance: $ " + saldo + "0\n";
    }
}
