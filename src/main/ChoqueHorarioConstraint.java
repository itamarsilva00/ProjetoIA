package main;

import main.aima.Assignment;
import main.aima.Constraint;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class ChoqueHorarioConstraint implements Constraint<Ocupacao, Horario> {

    private Ocupacao ocupacao;
    private List<Ocupacao> outrasOcupacoes;


    public ChoqueHorarioConstraint(Ocupacao ocupacao, List<Ocupacao> outrasOcupacoes) {
        this.ocupacao = ocupacao;
        this.outrasOcupacoes = outrasOcupacoes;
    }

    @Override
    public List<Ocupacao> getScope() {
        return Collections.singletonList(ocupacao);
    }

    @Override
    public boolean isSatisfiedWith(Assignment<Ocupacao, Horario> assignment) {
        Horario atual = assignment.getValue(ocupacao);

        return outrasOcupacoes.stream().noneMatch(h -> assignment.getValue(h) == atual);
    }
}
