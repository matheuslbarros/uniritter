package br.edu.uniritter.calculadora;

import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author alu201011612
 */
class Calculadora {

    public int retornaResultadoDaExpressao(String expressao) {
        String[] expressoes = ("+ " + expressao).split(" ");
        
        List<Operacao> operacoes = new LinkedList();
        
        for(int i = 0; i < expressoes.length; i += 2) {
            String operacao = expressoes[i];
            Integer numero = Integer.parseInt(expressoes[i+1]);
            
            operacoes.add(new Operacao(operacao, numero));
        }
        
        Integer resultado = 0;
        
        for(int i = 1; i < operacoes.size(); i++) {
            Operacao operacao1 = operacoes.get(i - 1);
            Operacao operacao2 = operacoes.get(i);
            
            switch(operacao2.getOperacao()) {
                case "*":
                case "/":
                    resultado += operacao2.retornaResultadoDaOperacao(operacao1.getNumero());
                    
                    Operacao operacaoVazia = new Operacao("+", 0);
                    
                    operacoes.remove((i-1));
                    operacoes.remove((i-1));
                    
                    operacoes.add((i-1), operacaoVazia);
                    operacoes.add((i-1), operacaoVazia);
                    
                    break;
            }
        }
        
        for(int i = 1; i < operacoes.size(); i++) {
            Operacao operacao1 = operacoes.get(i - 1);
            Operacao operacao2 = operacoes.get(i);
            
            switch(operacao2.getOperacao()) {
                case "+":
                case "-":
                    resultado += operacao2.retornaResultadoDaOperacao(operacao1.getNumero());
                    
                    Operacao operacaoVazia = new Operacao("+", 0);
                    
                    operacoes.remove((i-1));
                    operacoes.remove((i-1));
                    
                    operacoes.add((i-1), operacaoVazia);
                    operacoes.add((i-1), operacaoVazia);
                    
                    break;
            }
        }
        
        return resultado;
    }

    public Integer recebeAntigo(String expressao) {
        String[] expressoes = ("+ " + expressao).split(" ");
        
        Integer result = Integer.parseInt(expressoes[0]);
        
        for(int i = 1; i < (expressoes.length - 1); i += 2) {
            System.out.println("operacao: " + expressoes[i]);
            System.out.println("numero: " + expressoes[i+1]);
            
            String operacao = expressoes[i];
            Integer numero = Integer.parseInt(expressoes[i + 1]);
            
            switch(operacao) {
                case "+": result += numero; break;
                case "-": result -= numero; break;
                case "/": result /= numero; break;
                case "*": result *= numero; break;
            }
        }
        
        return result;
    }

}
