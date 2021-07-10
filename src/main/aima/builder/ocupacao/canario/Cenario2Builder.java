package main.aima.builder.ocupacao.canario;

import main.aima.builder.ocupacao.AlmocoBuilder;
import main.aima.builder.ocupacao.OcupacaoBuilder;
import main.aima.variable.OcupacaoVariable;

import java.util.ArrayList;
import java.util.List;

import static main.aima.domain.DiaSemana.*;
import static main.aima.domain.DiaSemana.SEXTA;
import static main.aima.domain.TipoOcupacao.*;

public class Cenario2Builder extends CenarioBuilder {

    @Override
    public List<OcupacaoVariable> carregarOcupacoes() {
        List<OcupacaoVariable> aux = new ArrayList<>(AlmocoBuilder.buildAlmoco());
        aux.addAll(buildEstagio());

        aux.add(new OcupacaoVariable("COMP0409", "13:00", SEGUNDA, AULA, 100));
        aux.add(new OcupacaoVariable("COMP0409", "13:30", SEGUNDA, AULA, 100));
        aux.add(new OcupacaoVariable("COMP0409", "14:00", SEGUNDA, AULA, 100));
        aux.add(new OcupacaoVariable("COMP0409", "14:30", SEGUNDA, AULA, 100));
        aux.add(new OcupacaoVariable("Lanche", "15:00", SEGUNDA, ALIMENTACAO, 1000));

        aux.add(new OcupacaoVariable("COMP0408", "17:00", SEGUNDA, AULA, 200));
        aux.add(new OcupacaoVariable("COMP0408", "17:30", SEGUNDA, AULA, 200));
        aux.add(new OcupacaoVariable("COMP0408", "18:00", SEGUNDA, AULA, 200));
        aux.add(new OcupacaoVariable("COMP0408", "18:30", SEGUNDA, AULA, 200));

        aux.add(new OcupacaoVariable("COMP0461", "20:00", SEGUNDA, AULA, 300));
        aux.add(new OcupacaoVariable("COMP0461", "20:30", SEGUNDA, AULA, 300));
        aux.add(new OcupacaoVariable("COMP0461", "21:00", SEGUNDA, AULA, 300));
        aux.add(new OcupacaoVariable("COMP0461", "21:30", SEGUNDA, AULA, 300));

        aux.add(new OcupacaoVariable("COMP0412", "15:00", TERCA, AULA, 400));
        aux.add(new OcupacaoVariable("COMP0412", "15:30", TERCA, AULA, 400));
        aux.add(new OcupacaoVariable("COMP0412", "16:00", TERCA, AULA, 400));
        aux.add(new OcupacaoVariable("COMP0412", "16:30", TERCA, AULA, 400));
        aux.add(new OcupacaoVariable("Lanche", "17:00", TERCA, ALIMENTACAO, 1001));

        aux.add(new OcupacaoVariable("COMP0409", "13:00", QUARTA, AULA, 500));
        aux.add(new OcupacaoVariable("COMP0409", "13:30", QUARTA, AULA, 500));
        aux.add(new OcupacaoVariable("COMP0409", "14:00", QUARTA, AULA, 500));
        aux.add(new OcupacaoVariable("COMP0409", "14:30", QUARTA, AULA, 500));
        aux.add(new OcupacaoVariable("Lanche", "15:00", QUARTA, ALIMENTACAO, 1002));

        aux.add(new OcupacaoVariable("COMP0408", "17:00", QUARTA, AULA, 600));
        aux.add(new OcupacaoVariable("COMP0408", "17:30", QUARTA, AULA, 600));
        aux.add(new OcupacaoVariable("COMP0408", "18:00", QUARTA, AULA, 600));
        aux.add(new OcupacaoVariable("COMP0408", "18:30", QUARTA, AULA, 600));

        aux.add(new OcupacaoVariable("COMP0461", "20:00", QUARTA, AULA, 700));
        aux.add(new OcupacaoVariable("COMP0461", "20:30", QUARTA, AULA, 700));
        aux.add(new OcupacaoVariable("COMP0461", "21:00", QUARTA, AULA, 700));
        aux.add(new OcupacaoVariable("COMP0461", "21:30", QUARTA, AULA, 700));

        aux.add(new OcupacaoVariable("COMP0412", "15:00", QUINTA, AULA, 800));
        aux.add(new OcupacaoVariable("COMP0412", "15:30", QUINTA, AULA, 800));
        aux.add(new OcupacaoVariable("COMP0412", "16:00", QUINTA, AULA, 800));
        aux.add(new OcupacaoVariable("COMP0412", "16:30", QUINTA, AULA, 800));
        aux.add(new OcupacaoVariable("Lanche", "17:00", QUINTA, ALIMENTACAO, 1003));

        aux.add(new OcupacaoVariable("COMP0438", "13:00", SEXTA, AULA, 900));
        aux.add(new OcupacaoVariable("COMP0438", "13:30", SEXTA, AULA, 900));
        aux.add(new OcupacaoVariable("COMP0438", "14:00", SEXTA, AULA, 900));
        aux.add(new OcupacaoVariable("COMP0438", "14:30", SEXTA, AULA, 900));
        aux.add(new OcupacaoVariable("COMP0438", "15:00", SEXTA, AULA, 900));
        aux.add(new OcupacaoVariable("COMP0438", "15:30", SEXTA, AULA, 900));
        aux.add(new OcupacaoVariable("COMP0438", "16:00", SEXTA, AULA, 900));
        aux.add(new OcupacaoVariable("COMP0438", "16:30", SEXTA, AULA, 900));
        aux.add(new OcupacaoVariable("Lanche", "17:00", SEXTA, ALIMENTACAO, 1004));

        return aux;
    }

    private static List<OcupacaoVariable> buildEstagio() {
        return OcupacaoBuilder.buildOcupacao("Estágio", TRABALHO, 5000);
    }

}
