package main;

import main.aima.core.*;
import main.aima.csp.AgendaCSP;
import main.aima.domain.DiaSemana;
import main.aima.domain.HorarioDomain;
import main.aima.variable.OcupacaoVariable;

import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

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

//        solution.get().getVariables()
//                .stream().sorted(Comparator.comparingLong(c -> c.getHoraDiaSemana().getOrdem()))
//                .forEach(consumer -> System.out.println(consumer.getHoraDiaSemana().getDiaSemana().name() + " | " + consumer.getHoraDiaSemana().getHora() + ": " + consumer.getNome()));

//        solution.ifPresent(System.out::println);

        imprimirCalendario(solution.get().getVariables());
        System.out.println(stepCounter.getResults() + "\n");

    }

    public static void imprimirCalendario(List<OcupacaoVariable> ocupacaoList) {

        List<List<OcupacaoVariable>> ocupacaoMatriz = new ArrayList<>(6);

        DiaSemana[] values = DiaSemana.values();
        IntStream.range(0, values.length).forEach(i -> {
            DiaSemana dia = values[i];
            List<OcupacaoVariable> collect = ocupacaoList.stream()
                    .filter(p -> p.getHoraDiaSemana().getDiaSemana() == dia)
                    .sorted(Comparator.comparingLong(c -> c.getHoraDiaSemana().getOrdem()))
                    .collect(Collectors.toList());
            ocupacaoMatriz.add(i, collect);
        });


        List<DiaSemana> acumulador = new ArrayList<>();

        ocupacaoList.stream().map(mapper -> new Pair(mapper.getHoraDiaSemana().getHora(), mapper))
                .forEach(it -> {
                    if (acumulador.contains(it.valor.getHoraDiaSemana().getDiaSemana())) {
                        acumulador.clear();
                        System.out.println();
                        System.out.print(it.valor.getNome()+" ");
                    } else {
                        acumulador.add(it.valor.getHoraDiaSemana().getDiaSemana());
                        System.out.print(it.valor.getNome() + " ");
                    }
                });


    }

}

class Pair {
    String chave;
    OcupacaoVariable valor;

    public Pair(String chave, OcupacaoVariable valor) {
        this.chave = chave;
        this.valor = valor;
    }
}
