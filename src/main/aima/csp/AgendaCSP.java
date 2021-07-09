package main.aima.csp;

import main.aima.builder.HorarioAlunoBuilder;
import main.aima.builder.OcupacaoBuilder;
import main.aima.constraint.ChoqueHorarioConstraint;
import main.aima.constraint.HorarioDefinidoConstraint;
import main.aima.constraint.ManterGrupoConstraint;
import main.aima.constraint.OrdenarHoraConstraint;
import main.aima.core.CSP;
import main.aima.core.Domain;
import main.aima.domain.HorarioDomain;
import main.aima.variable.OcupacaoVariable;

import java.util.ArrayList;
import java.util.List;

public class AgendaCSP extends CSP<OcupacaoVariable, HorarioDomain> {


    public AgendaCSP() {
        List<OcupacaoVariable> ocupacaoVariableList = OcupacaoBuilder.buildCenario1();

        Domain<HorarioDomain> domain = new Domain<>(
                HorarioAlunoBuilder.build(8, 23)
        );

        ocupacaoVariableList.forEach(this::addVariable);

        for (OcupacaoVariable var : getVariables())
            setDomain(var, domain);

        ocupacaoVariableList.forEach(ocupacao -> {
            ArrayList<OcupacaoVariable> aux = new ArrayList<>(ocupacaoVariableList);
            aux.remove(ocupacao);
//            addConstraint(new OrdenarHoraConstraint(ocupacao, aux));
            addConstraint(new ChoqueHorarioConstraint(ocupacao, aux));
            addConstraint(new ManterGrupoConstraint(ocupacao, aux));
            addConstraint(new HorarioDefinidoConstraint(ocupacao));
        });
    }
}
