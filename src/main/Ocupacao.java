package main;

import main.aima.Variable;

public class Ocupacao extends Variable {

    private String nome;
    private int grupo;

    public Ocupacao(String name) {
        super(name);
    }

    public Ocupacao(String nome, int grupo) {
        super(nome + " " + grupo);
        this.nome = nome;
        this.grupo = grupo;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public int getGrupo() {
        return grupo;
    }

    public void setGrupo(int grupo) {
        if (grupo <= 0) throw new RuntimeException("Duracao deve ser maior que 0");
        this.grupo = grupo;
    }

    @Override
    public String toString() {
        return this.nome;
    }
}
