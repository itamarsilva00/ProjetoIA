package main.aima.builder.ocupacao.canario;

import main.aima.variable.OcupacaoVariable;

import java.util.List;

public abstract class CenarioBuilder {

    public abstract List<OcupacaoVariable> carregarOcupacoes();

    public static CenarioBuilder build(int cenario) {
        switch (cenario) {
            case 1: return new Cenario1Builder();
            case 2: return new Cenario2Builder();
            default: return new Cenario3Builder();
        }
    }
}
