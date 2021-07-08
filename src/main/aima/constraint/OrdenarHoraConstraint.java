package main.aima.constraint;

import main.aima.domain.HorarioDomain;
import main.aima.variable.OcupacaoVariable;
import main.aima.core.Assignment;
import main.aima.core.Constraint;

import java.util.Collections;
import java.util.List;

public class OrdenarHoraConstraint implements Constraint<OcupacaoVariable, HorarioDomain> {

    private OcupacaoVariable ocupacaoVariable;
    private List<OcupacaoVariable> outrasOcupacoes;

    public OrdenarHoraConstraint(OcupacaoVariable ocupacaoVariable, List<OcupacaoVariable> outrasOcupacoes) {
        this.ocupacaoVariable = ocupacaoVariable;
        this.outrasOcupacoes = outrasOcupacoes;
    }

    @Override
    public List<OcupacaoVariable> getScope() {
        return Collections.singletonList(ocupacaoVariable);
    }

    @Override
    public boolean isSatisfiedWith(Assignment<OcupacaoVariable, HorarioDomain> assignment) {
        HorarioDomain atual = assignment.getValue(ocupacaoVariable);

        return outrasOcupacoes.stream().noneMatch(h -> assignment.getValue(h) != null && assignment.getValue(h).getOrdem() > atual.getOrdem());
    }
}
