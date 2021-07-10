package main;

import main.aima.builder.HorarioAlunoBuilder;
import main.aima.core.*;
import main.aima.csp.AgendaCSP;
import main.aima.domain.DiaSemana;
import main.aima.domain.HorarioDomain;
import main.aima.variable.OcupacaoVariable;

import java.util.*;

public class ProjetoFinal extends CSP {

    public static void main(String[] args) {
        CSP<OcupacaoVariable, HorarioDomain> csp = new AgendaCSP();
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
