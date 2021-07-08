package main;

import main.aima.*;

import java.util.Optional;

public class ProjetoFinal extends CSP {

    public static void main(String[] args) {
        CSP<Ocupacao, Horario> csp = new AgendaCSP();
        CspListener.StepCounter<Ocupacao, Horario> stepCounter = new CspListener.StepCounter<>();
        CspSolver<Ocupacao, Horario> solver;
        Optional<Assignment<Ocupacao, Horario>> solution;

        solver = new FlexibleBacktrackingSolver<>();
        solver.addCspListener(stepCounter);
        stepCounter.reset();
        solution = solver.solve(csp);
        solution.ifPresent(System.out::println);
        System.out.println(stepCounter.getResults() + "\n");
    }
}
