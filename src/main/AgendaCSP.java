package main;

import main.aima.CSP;
import main.aima.Domain;
import main.aima.constraint.ManterGrupoConstraint;
import main.aima.constraint.OrdenarHoraConstraint;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AgendaCSP extends CSP<Ocupacao, Horario> {

    private Ocupacao trampo1 = new Ocupacao("Trampo1", 1);
    private Ocupacao trampo2 = new Ocupacao("Trampo2", 1);

    private Ocupacao trampo3 = new Ocupacao("Trampo3", 2);
    private Ocupacao trampo4 = new Ocupacao("Trampo4", 2);
    private Ocupacao trampo5 = new Ocupacao("Trampo5", 2);
    private Ocupacao trampo6 = new Ocupacao("Trampo6", 5);
    private Ocupacao trampo7 = new Ocupacao("Trampo7", 5);

    private Ocupacao estudo1 = new Ocupacao("estudo1", 3);
    private Ocupacao estudo2 = new Ocupacao("estudo2", 3);

    private Horario horario1 = new Horario("07:30", DiaSemana.SEGUNDA, 1);
    private Horario horario2 = new Horario("07:00", DiaSemana.SEGUNDA, 2);
    private Horario horario3 = new Horario("08:00", DiaSemana.SEGUNDA, 3);
    private Horario horario4 = new Horario("08:30", DiaSemana.SEGUNDA, 4);
    private Horario horario5 = new Horario("09:00", DiaSemana.SEGUNDA, 5);

    private Horario horario11 = new Horario("07:00", DiaSemana.TERCA, 6);
    private Horario horario12 = new Horario("07:30", DiaSemana.TERCA, 7);
    private Horario horario13 = new Horario("08:00", DiaSemana.TERCA, 8);
    private Horario horario14 = new Horario("08:30", DiaSemana.TERCA, 9);
    private Horario horario15 = new Horario("09:00", DiaSemana.TERCA, 10);

    public AgendaCSP() {
        List<Ocupacao> ocupacaoList = Arrays.asList(
                trampo1, trampo2, trampo3,
                trampo4, trampo5, trampo6, trampo7,
                estudo1, estudo2);


        Domain<Horario> domain = new Domain<>(
                horario1, horario2, horario3, horario4, horario5,
                horario11, horario12, horario13, horario14, horario15
        );

        ocupacaoList.forEach(this::addVariable);

        for (Ocupacao var : getVariables())
            setDomain(var, domain);

        ocupacaoList.forEach(ocupacao -> {
            ArrayList<Ocupacao> aux = new ArrayList<>(ocupacaoList);
            aux.remove(ocupacao);
            addConstraint(new OrdenarHoraConstraint(ocupacao, aux));
            addConstraint(new ChoqueHorarioConstraint(ocupacao, aux));
            addConstraint(new ManterGrupoConstraint(ocupacao, aux));
        });
    }
}
