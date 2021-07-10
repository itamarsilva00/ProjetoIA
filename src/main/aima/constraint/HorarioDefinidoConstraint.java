package main.aima.constraint;

import main.aima.core.Assignment;
import main.aima.core.Constraint;
import main.aima.domain.HoraDiaSemana;
import main.aima.domain.HorarioDomain;
import main.aima.variable.OcupacaoVariable;

import java.util.Collections;
import java.util.List;

public class HorarioDefinidoConstraint implements Constraint<OcupacaoVariable, HorarioDomain> {

    private final OcupacaoVariable ocupacaoVariable;

    public HorarioDefinidoConstraint(OcupacaoVariable ocupacaoVariable) {
        this.ocupacaoVariable = ocupacaoVariable;
    }

    @Override
    public List<OcupacaoVariable> getScope() {
        return Collections.singletonList(ocupacaoVariable);
    }

    @Override
    public boolean isSatisfiedWith(Assignment<OcupacaoVariable, HorarioDomain> assignment) {
        HorarioDomain atual = assignment.getValue(ocupacaoVariable);
        HoraDiaSemana horaDiaSemana = ocupacaoVariable.getHoraDiaSemana();

        return atual.getHoraDiaSemana() != null && (horaDiaSemana == null || horaDiaSemana.getOrdem() == atual.getHoraDiaSemana().getOrdem());
    }
}
