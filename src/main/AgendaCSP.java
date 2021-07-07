package main;

import main.aima.CSP;
import main.aima.Domain;
import main.aima.Variable;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class AgendaCSP extends CSP<Ocupacao, Horario> {

    private Ocupacao ocupacao = new Ocupacao("Trampo", 0);
    private Ocupacao ocupacao1 = new Ocupacao("estudo 1", 0);
    private Ocupacao ocupacao2 = new Ocupacao("estudo 2", 0);

    private Horario horario1 = new Horario("07:30", DiaSemana.SEGUNDA);
    private Horario horario2 = new Horario("07:00", DiaSemana.SEGUNDA);
    private Horario horario3 = new Horario("08:00", DiaSemana.SEGUNDA);
    private Horario horario4 = new Horario("08:30", DiaSemana.SEGUNDA);
    private Horario horario5 = new Horario("09:00", DiaSemana.SEGUNDA);

    public AgendaCSP() {
        List<Ocupacao> ocupacaoList = Arrays.asList(ocupacao, ocupacao1, ocupacao2);
        Domain<Horario> domain = new Domain<>(horario1, horario2, horario3, horario4, horario5);

        ocupacaoList.forEach(this::addVariable);

        for (Ocupacao var : getVariables())
            setDomain(var, domain);

        addConstraint(new ChoqueHorarioConstraint(ocupacao, ocupacaoList.stream().filter(it -> it != ocupacao).collect(Collectors.toList())));
        addConstraint(new ChoqueHorarioConstraint(ocupacao1, ocupacaoList.stream().filter(it -> it != ocupacao1).collect(Collectors.toList())));
        addConstraint(new ChoqueHorarioConstraint(ocupacao2, ocupacaoList.stream().filter(it -> it != ocupacao2).collect(Collectors.toList())));
    }
}
