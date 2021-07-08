package main;

import main.aima.core.*;
import main.aima.csp.AgendaCSP;
import main.aima.domain.HorarioDomain;
import main.aima.variable.OcupacaoVariable;

import java.util.Optional;

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
        solution.ifPresent(System.out::println);
        System.out.println(stepCounter.getResults() + "\n");
    }
}
