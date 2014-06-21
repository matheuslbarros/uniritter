package br.edu.uniritter.calculadora;

/**
 *
 * @author alu201011612
 */
class Operacao {

    private final String operacao;
    private final Integer numero;

    public Operacao(String operacao, Integer numero) {
        this.operacao = operacao;
        this.numero = numero;
    }

    public String getOperacao() {
        return operacao;
    }

    public Integer getNumero() {
        return numero;
    }

    public Integer retornaResultadoDaOperacao(Integer resultado) {
        System.out.println(resultado + operacao + numero);
        
        switch(operacao) {
            case "+": resultado += numero; break;
            case "-": resultado -= numero; break;
            case "*": resultado *= numero; break;
            case "/": resultado /= numero; break;
        }
        
        return resultado;
    }

    @Override
    public String toString() {
        return "{" + operacao + " " + numero + "}";
    }

}
