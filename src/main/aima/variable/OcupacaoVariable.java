package main.aima.variable;

import main.aima.core.Variable;

public class OcupacaoVariable extends Variable {

    private String nome;
    private int grupo;

    public OcupacaoVariable(String name) {
        super(name);
    }

    public OcupacaoVariable(String nome, int grupo) {
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
