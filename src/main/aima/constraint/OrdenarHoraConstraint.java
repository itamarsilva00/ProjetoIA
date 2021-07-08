package main.aima.constraint;

import main.Horario;
import main.Ocupacao;
import main.aima.Assignment;
import main.aima.Constraint;

import java.util.Collections;
import java.util.List;

public class OrdenarHoraConstraint implements Constraint<Ocupacao, Horario> {

    private Ocupacao ocupacao;
    private List<Ocupacao> outrasOcupacoes;

    public OrdenarHoraConstraint(Ocupacao ocupacao, List<Ocupacao> outrasOcupacoes) {
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

        return outrasOcupacoes.stream().noneMatch(h -> assignment.getValue(h) != null && assignment.getValue(h).getOrdem() > atual.getOrdem());
    }
}
