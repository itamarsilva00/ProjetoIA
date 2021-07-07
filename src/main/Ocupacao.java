package main;

import main.aima.Variable;

public class Ocupacao extends Variable {

    private String nome;
    private int duracao;

    public Ocupacao(String name) {
        super(name);
    }

    public Ocupacao(String nome, int duracao) {
        super(nome + " " + duracao);
        this.nome = nome;
        this.duracao = duracao;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public int getDuracao() {
        return duracao;
    }

    public void setDuracao(int duracao) {
        if (duracao <= 0) throw new RuntimeException("Duracao deve ser maior que 0");
        this.duracao = duracao;
    }

    @Override
    public String toString() {
        return this.nome;
    }
}
