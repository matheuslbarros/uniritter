package br.edu.uniritter.salario;

import br.edu.uniritter.salario.cargo.Cargo;

/**
 *
 * @author matheus-lisboa
 */
public class Funcionario {

    private String nome;
    private Cargo cargo;
    private double salario;

    public Funcionario(String nome, Cargo cargo, double salario) {
        this.nome = nome;
        this.cargo = cargo;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public Cargo getCargo() {
        return cargo;
    }

    public double getSalario() {
        return salario;
    }

}
