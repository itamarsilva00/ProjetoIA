package main.aima.variable;

import main.aima.core.Variable;
import main.aima.domain.DiaSemana;
import main.aima.domain.HoraDiaSemana;

import java.util.UUID;

public class OcupacaoVariable extends Variable {

    private String nome;
    private int grupo;
    private HoraDiaSemana horaDiaSemana;

    public OcupacaoVariable(String nome, int grupo) {
        super(nome + UUID.randomUUID());
        this.nome = nome;
        this.grupo = grupo;
        this.horaDiaSemana = null;
    }

    public OcupacaoVariable(String nome, String hora, DiaSemana diaSemana, int grupo) {
        super(nome + UUID.randomUUID());
        this.horaDiaSemana = new HoraDiaSemana(hora, diaSemana);
        this.nome = nome;
        this.grupo = grupo;
    }

    public String getNome() {
        return nome;
    }

    public int getGrupo() {
        return grupo;
    }

    public HoraDiaSemana getHoraDiaSemana() {
        return horaDiaSemana;
    }

    @Override
    public String toString() {
        return this.nome;
    }
}
