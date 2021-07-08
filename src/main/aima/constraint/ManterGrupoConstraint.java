package main.aima.constraint;

import main.Horario;
import main.Ocupacao;
import main.aima.Assignment;
import main.aima.Constraint;

import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class ManterGrupoConstraint implements Constraint<Ocupacao, Horario> {

    private Ocupacao ocupacao;
    private List<Ocupacao> outrasOcupacoes;

    public ManterGrupoConstraint(Ocupacao ocupacao, List<Ocupacao> outrasOcupacoes) {
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

        int grupo = ocupacao.getGrupo();

        List<Ocupacao> mesmoGrupoList = outrasOcupacoes.stream()
                .filter(it -> it.getGrupo() == grupo)
                .collect(Collectors.toList());

        return mesmoGrupoList.stream()
                .map(assignment::getValue)
                .filter(Objects::nonNull)
                .allMatch(value-> value.getDiaSemana() == atual.getDiaSemana());

    }
}
