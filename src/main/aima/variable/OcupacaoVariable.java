package main.aima.variable;

import main.aima.core.Variable;
import main.aima.domain.DiaSemana;
import main.aima.domain.HoraDiaSemana;
import main.aima.domain.TipoOcupacao;

import java.util.UUID;

public class OcupacaoVariable extends Variable {

    private final String nome;
    private final long grupo;
    private final HoraDiaSemana horaDiaSemana;
    private TipoOcupacao ocupacao;

    public OcupacaoVariable(String nome, int grupo) {
        super(nome + UUID.randomUUID());
        this.nome = nome;
        this.grupo = grupo;
        this.horaDiaSemana = null;
    }

    public OcupacaoVariable(String nome, TipoOcupacao tipoOcupacao, long grupo) {
        super(nome + UUID.randomUUID());
        this.ocupacao = tipoOcupacao;
        this.nome = tipoOcupacao.cor + nome + "\u001B[0m";
        this.grupo = grupo;
        this.horaDiaSemana = null;
    }

    public OcupacaoVariable(String nome, String hora, DiaSemana diaSemana,TipoOcupacao tipoOcupacao, int grupo) {
        super(nome + UUID.randomUUID());
        this.horaDiaSemana = new HoraDiaSemana(hora, diaSemana);
        this.nome = nome;
        this.grupo = grupo;
        this.ocupacao = tipoOcupacao;
    }

    public String getNomeCor() {
        return ocupacao.cor + nome + "\u001B[0m";
    }

    public String getNome() {
        return nome;
    }

    public long getGrupo() {
        return grupo;
    }

    public HoraDiaSemana getHoraDiaSemana() {
        return horaDiaSemana;
    }

    @Override
    public String toString() {
        return this.nome;
    }

    public TipoOcupacao getOcupacao() {
        return ocupacao;
    }
}
