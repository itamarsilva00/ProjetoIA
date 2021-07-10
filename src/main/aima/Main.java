package main.aima;

import main.aima.builder.ocupacao.canario.CenarioBuilder;
import main.aima.csp.AgendaCSP;
import main.aima.domain.TipoOcupacao;
import main.aima.variable.OcupacaoVariable;

import java.util.*;
import java.util.stream.Collectors;

import static main.aima.domain.TipoOcupacao.ESTUDO;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        lerCenarios();
    }

    public static void lerCenarios() {
        while (true) {
            System.out.println("Qual o cenário deseja carregar (1, 2, 3)? Ou digite 0 para sair.");
            var cenario = 1;//scanner.nextInt();
            if (cenario == 0) return;

            if (cenario < 0 || cenario > 4) {
                System.out.println("Cenário inválido, tente novamente.");
                lerCenarios();
            }

            carregarCenario(cenario, 8, 23);

            return;
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
            var blocos = "4 5 6";//scanner.nextLine();

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

    public static void carregarCenario(int tipo, int inicio, int fim) {
        List<OcupacaoVariable> cenario =  CenarioBuilder.build(tipo).carregarOcupacoes();
        lerBlocos(cenario);

        AgendaCSP.iniciarCsp(cenario, inicio, fim);
    }

}
