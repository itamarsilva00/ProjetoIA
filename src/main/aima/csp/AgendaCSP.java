package main.aima.csp;

import main.aima.constraint.ChoqueHorarioConstraint;
import main.aima.domain.DiaSemana;
import main.aima.domain.HorarioDomain;
import main.aima.variable.OcupacaoVariable;
import main.aima.core.CSP;
import main.aima.core.Domain;
import main.aima.constraint.ManterGrupoConstraint;
import main.aima.constraint.OrdenarHoraConstraint;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AgendaCSP extends CSP<OcupacaoVariable, HorarioDomain> {

    private OcupacaoVariable trampo1 = new OcupacaoVariable("Trampo1", 1);
    private OcupacaoVariable trampo2 = new OcupacaoVariable("Trampo2", 1);

    private OcupacaoVariable trampo3 = new OcupacaoVariable("Trampo3", 2);
    private OcupacaoVariable trampo4 = new OcupacaoVariable("Trampo4", 2);
    private OcupacaoVariable trampo5 = new OcupacaoVariable("Trampo5", 2);
    private OcupacaoVariable trampo6 = new OcupacaoVariable("Trampo6", 5);
    private OcupacaoVariable trampo7 = new OcupacaoVariable("Trampo7", 5);

    private OcupacaoVariable estudo1 = new OcupacaoVariable("estudo1", 3);
    private OcupacaoVariable estudo2 = new OcupacaoVariable("estudo2", 3);

    private HorarioDomain horarioDomain1 = new HorarioDomain("07:30", DiaSemana.SEGUNDA, 1);
    private HorarioDomain horarioDomain2 = new HorarioDomain("07:00", DiaSemana.SEGUNDA, 2);
    private HorarioDomain horarioDomain3 = new HorarioDomain("08:00", DiaSemana.SEGUNDA, 3);
    private HorarioDomain horarioDomain4 = new HorarioDomain("08:30", DiaSemana.SEGUNDA, 4);
    private HorarioDomain horarioDomain5 = new HorarioDomain("09:00", DiaSemana.SEGUNDA, 5);

    private HorarioDomain horarioDomain11 = new HorarioDomain("07:00", DiaSemana.TERCA, 6);
    private HorarioDomain horarioDomain12 = new HorarioDomain("07:30", DiaSemana.TERCA, 7);
    private HorarioDomain horarioDomain13 = new HorarioDomain("08:00", DiaSemana.TERCA, 8);
    private HorarioDomain horarioDomain14 = new HorarioDomain("08:30", DiaSemana.TERCA, 9);
    private HorarioDomain horarioDomain15 = new HorarioDomain("09:00", DiaSemana.TERCA, 10);

    public AgendaCSP() {
        List<OcupacaoVariable> ocupacaoVariableList = Arrays.asList(
                trampo1, trampo2, trampo3,
                trampo4, trampo5, trampo6, trampo7,
                estudo1, estudo2);


        Domain<HorarioDomain> domain = new Domain<>(
                horarioDomain1, horarioDomain2, horarioDomain3, horarioDomain4, horarioDomain5,
                horarioDomain11, horarioDomain12, horarioDomain13, horarioDomain14, horarioDomain15
        );

        ocupacaoVariableList.forEach(this::addVariable);

        for (OcupacaoVariable var : getVariables())
            setDomain(var, domain);

        ocupacaoVariableList.forEach(ocupacao -> {
            ArrayList<OcupacaoVariable> aux = new ArrayList<>(ocupacaoVariableList);
            aux.remove(ocupacao);
            addConstraint(new OrdenarHoraConstraint(ocupacao, aux));
            addConstraint(new ChoqueHorarioConstraint(ocupacao, aux));
            addConstraint(new ManterGrupoConstraint(ocupacao, aux));
        });
    }
}
