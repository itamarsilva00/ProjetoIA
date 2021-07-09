package main.aima.constraint;

import main.aima.domain.HorarioDomain;
import main.aima.variable.OcupacaoVariable;
import main.aima.core.Assignment;
import main.aima.core.Constraint;

import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class ManterGrupoConstraint implements Constraint<OcupacaoVariable, HorarioDomain> {

    private OcupacaoVariable ocupacaoVariable;
    private List<OcupacaoVariable> outrasOcupacoes;

    public ManterGrupoConstraint(OcupacaoVariable ocupacaoVariable, List<OcupacaoVariable> outrasOcupacoes) {
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

        int grupo = ocupacaoVariable.getGrupo();

        List<OcupacaoVariable> mesmoGrupoList = outrasOcupacoes.stream()
                .filter(it -> it.getGrupo() == grupo)
                .collect(Collectors.toList());

        return mesmoGrupoList.stream()
                .map(assignment::getValue)
                .filter(Objects::nonNull)
                .allMatch(value-> value.getHoraDiaSemana().getDiaSemana() == atual.getHoraDiaSemana().getDiaSemana());

    }
}
