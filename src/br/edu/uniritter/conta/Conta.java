package br.edu.uniritter.conta;

/**
 *
 * @author alu201011612
 */
public abstract class Conta {

    private final int numero;
    private double saldo;

    public Conta(int numero, double quantia) {
        this.numero = numero;
        this.saldo = quantia;
    }

    public int retornaNumeroConta() {
        return numero;
    }

    public double verificaSaldo() {
        return saldo;
    }

    public void deposita(double quantia) {
        this.saldo += quantia;
    }

    public void saca(double quantia) throws Exception {
        if (quantia > this.saldo) {
            throw new Exception("Saque negado, quantia maior que saldo!");
        }
        
        this.saldo -= quantia;
    }

    public void transfere(double quantia, Conta contaDestino) throws Exception {
        saca(quantia);
        contaDestino.deposita(quantia);
    }

}
