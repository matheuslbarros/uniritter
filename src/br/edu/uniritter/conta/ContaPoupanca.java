package br.edu.uniritter.conta;

/**
 *
 * @author alu201011612
 */
public class ContaPoupanca extends Conta {

    public static final double SALDO_INICIAL = 100;

    public ContaPoupanca(int numero) {
        super(numero, SALDO_INICIAL);
    }

}
