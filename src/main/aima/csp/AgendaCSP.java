package main.aima.csp;

import main.aima.builder.HorarioAlunoBuilder;
import main.aima.builder.ocupacao.Cenario1Builder;
import main.aima.constraint.ChoqueHorarioConstraint;
import main.aima.constraint.HorarioDefinidoConstraint;
import main.aima.constraint.ManterGrupoConstraint;
import main.aima.core.*;
import main.aima.domain.DiaSemana;
import main.aima.domain.HorarioDomain;
import main.aima.variable.OcupacaoVariable;

import java.util.*;

public class AgendaCSP extends CSP<OcupacaoVariable, HorarioDomain> {

    public AgendaCSP() {
        List<OcupacaoVariable> ocupacaoVariableList = Cenario1Builder.buildCenario();

        Domain<HorarioDomain> domain = new Domain<>(HorarioAlunoBuilder.build(8, 23));

        ocupacaoVariableList.forEach(this::addVariable);

        for (OcupacaoVariable var : getVariables())
            setDomain(var, domain);

        ocupacaoVariableList.forEach(ocupacao -> {
            ArrayList<OcupacaoVariable> aux = new ArrayList<>(ocupacaoVariableList);
            aux.remove(ocupacao);
            addConstraint(new ChoqueHorarioConstraint(ocupacao, aux));
            addConstraint(new ManterGrupoConstraint(ocupacao, aux));
            addConstraint(new HorarioDefinidoConstraint(ocupacao));
        });
    }

    public AgendaCSP(List<OcupacaoVariable> variableList, int horaInicio, int horaFim) {
        Domain<HorarioDomain> domain = new Domain<>(HorarioAlunoBuilder.build(horaInicio, horaFim));

        variableList.forEach(this::addVariable);

        for (OcupacaoVariable var : getVariables())
            setDomain(var, domain);

        variableList.forEach(ocupacao -> {
            ArrayList<OcupacaoVariable> aux = new ArrayList<>(variableList);
            aux.remove(ocupacao);
            addConstraint(new ChoqueHorarioConstraint(ocupacao, aux));
            addConstraint(new ManterGrupoConstraint(ocupacao, aux));
//            addConstraint(new HorarioDefinidoConstraint(ocupacao));
        });
    }

    public static void iniciarCsp(List<OcupacaoVariable> variableList, int horaInicio, int horaFim) {
        CSP<OcupacaoVariable, HorarioDomain> csp = new AgendaCSP(variableList, horaInicio, horaFim);
        CspListener.StepCounter<OcupacaoVariable, HorarioDomain> stepCounter = new CspListener.StepCounter<>();
        CspSolver<OcupacaoVariable, HorarioDomain> solver;
        Optional<Assignment<OcupacaoVariable, HorarioDomain>> solution;

        solver = new FlexibleBacktrackingSolver<>();
        solver.addCspListener(stepCounter);
        stepCounter.reset();
        solution = solver.solve(csp);

        if (solution.isPresent()) {
            imprimirCalendario(solution.get().getVariables());
        } else {
            System.out.println("\u001B[1m" + "Solução não encontrada" + "\u001B[0m");
        }

        System.out.println(stepCounter.getResults() + "\n");
    }

    public static void imprimirCalendario(List<OcupacaoVariable> ocupacaoList) {
        Arrays.stream(DiaSemana.values()).forEach(dia-> {
            System.out.println("\n\u001B[1m" + dia + "\u001B[0m");

            ocupacaoList.stream()
                    .filter(it -> it.getHoraDiaSemana().getDiaSemana() == dia)
                    .sorted(Comparator.comparingLong(c -> c.getHoraDiaSemana().getOrdem()))
                    .forEach(consumer -> System.out.println(consumer.getHoraDiaSemana().getHora() + " | " + consumer.getNomeCor() +" |"));
        });
    }
}
