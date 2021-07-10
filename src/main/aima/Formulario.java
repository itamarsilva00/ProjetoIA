package main.aima;

import main.aima.builder.ocupacao.Cenario1Builder;
import main.aima.core.Pair;
import main.aima.csp.AgendaCSP;
import main.aima.domain.TipoOcupacao;
import main.aima.variable.OcupacaoVariable;

import java.util.*;
import java.util.stream.Collectors;

import static main.aima.domain.TipoOcupacao.ESTUDO;

public class Formulario {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("Qual o cenário deseja carregar (1, 2, 3)?");
            var cenario = scanner.nextInt();
            if (cenario < 0 || cenario > 4) return;

            var horarios = new Pair<>(8, 23);
            if (cenario == 1) {
                carregaCenario1(horarios.getFirst(), horarios.getSecond());
            }
        }
    }

    public static void lerBlocos(List<OcupacaoVariable> variableList) {
        var disciplinas = variableList.stream()
                .filter(it -> it.getOcupacao() == TipoOcupacao.AULA)
                .map(OcupacaoVariable::getNome).collect(Collectors.toSet());

        System.out.println("\u001B[1m" + "Instruções: 1 - 30min, 2 - 1h, 3 - 1h30" + "\u001B[0m");

        disciplinas.forEach(consumer -> {
            System.out.println("Digite a quantidade de blocos de meia hora para a disciplina " + consumer + ": ");
            scanner = new Scanner(System.in);
            var blocos = scanner.nextLine();

            Arrays.stream(blocos.split(" ")).map(Integer::parseInt).forEach(a -> {
                var grupo = Math.abs(new Random().nextLong());

                for (int i = 0; i < a; i++) {
                    String nome = "Estudar disciplina " + consumer;
                    var variable = new OcupacaoVariable(nome, ESTUDO, grupo);
                    variableList.add(variable);
                }
            });
        });
    }

    public static void carregaCenario1(int inicio, int fim) {
        List<OcupacaoVariable> cenario = Cenario1Builder.buildCenario();
        lerBlocos(cenario);

        AgendaCSP.iniciarCsp(cenario, inicio, fim);
    }

}
