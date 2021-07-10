package main.aima.constraint;

import main.aima.domain.HorarioDomain;
import main.aima.variable.OcupacaoVariable;
import main.aima.core.Assignment;
import main.aima.core.Constraint;

import java.util.ArrayList;
import java.util.List;

public class ChoqueHorarioConstraint implements Constraint<OcupacaoVariable, HorarioDomain> {

    final private OcupacaoVariable ocupacaoVariable;
    final private List<OcupacaoVariable> outrasOcupacoes;

    public ChoqueHorarioConstraint(OcupacaoVariable ocupacaoVariable, List<OcupacaoVariable> outrasOcupacoes) {
        this.ocupacaoVariable = ocupacaoVariable;
        this.outrasOcupacoes = outrasOcupacoes;
    }

    @Override
    public List<OcupacaoVariable> getScope() {
        var aux = new ArrayList<OcupacaoVariable>();
        aux.add(ocupacaoVariable);
        aux.add(ocupacaoVariable);
        return aux;
    }

    @Override
    public boolean isSatisfiedWith(Assignment<OcupacaoVariable, HorarioDomain> assignment) {
        HorarioDomain atual = assignment.getValue(ocupacaoVariable);

        return outrasOcupacoes.stream().noneMatch(h -> assignment.getValue(h) == atual);
    }
}
