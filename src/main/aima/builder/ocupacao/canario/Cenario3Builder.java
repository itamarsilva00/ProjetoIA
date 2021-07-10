package main.aima.builder.ocupacao.canario;

import main.aima.builder.ocupacao.AlmocoBuilder;
import main.aima.builder.ocupacao.OcupacaoBuilder;
import main.aima.variable.OcupacaoVariable;

import java.util.ArrayList;
import java.util.List;

import static main.aima.domain.DiaSemana.*;
import static main.aima.domain.DiaSemana.QUARTA;
import static main.aima.domain.TipoOcupacao.*;

public class Cenario3Builder extends CenarioBuilder {

    @Override
    public List<OcupacaoVariable> carregarOcupacoes() {
        List<OcupacaoVariable> aux = new ArrayList<>(AlmocoBuilder.buildAlmoco());
        aux.addAll(buildPibit());

        aux.add(new OcupacaoVariable("ELET0043", "13:00", SEGUNDA, AULA, 100));
        aux.add(new OcupacaoVariable("ELET0043", "13:30", SEGUNDA, AULA, 100));
        aux.add(new OcupacaoVariable("ELET0043", "14:00", SEGUNDA, AULA, 100));
        aux.add(new OcupacaoVariable("ELET0043", "14:30", SEGUNDA, AULA, 100));

        aux.add(new OcupacaoVariable("ESTAT0011", "15:00", SEGUNDA, AULA, 200));
        aux.add(new OcupacaoVariable("ESTAT0011", "15:30", SEGUNDA, AULA, 200));
        aux.add(new OcupacaoVariable("ESTAT0011", "16:00", SEGUNDA, AULA, 200));
        aux.add(new OcupacaoVariable("ESTAT0011", "16:30", SEGUNDA, AULA, 200));

        aux.add(new OcupacaoVariable("COMP0415", "17:00", SEGUNDA, AULA, 300));
        aux.add(new OcupacaoVariable("COMP0415", "17:30", SEGUNDA, AULA, 300));
        aux.add(new OcupacaoVariable("COMP0415", "18:00", SEGUNDA, AULA, 300));
        aux.add(new OcupacaoVariable("COMP0415", "18:30", SEGUNDA, AULA, 300));
        aux.add(new OcupacaoVariable("Lanche", "19:00", SEGUNDA, ALIMENTACAO, 1000));

        aux.add(new OcupacaoVariable("MAT0096", "13:00", TERCA, AULA, 400));
        aux.add(new OcupacaoVariable("MAT0096", "13:30", TERCA, AULA, 400));
        aux.add(new OcupacaoVariable("MAT0096", "14:00", TERCA, AULA, 400));
        aux.add(new OcupacaoVariable("MAT0096", "14:30", TERCA, AULA, 400));

        aux.add(new OcupacaoVariable("COMP0409", "15:00", TERCA, AULA, 500));
        aux.add(new OcupacaoVariable("COMP0409", "15:30", TERCA, AULA, 500));
        aux.add(new OcupacaoVariable("COMP0409", "16:00", TERCA, AULA, 500));
        aux.add(new OcupacaoVariable("COMP0409", "16:30", TERCA, AULA, 500));

        aux.add(new OcupacaoVariable("COMP0412", "17:00", TERCA, AULA, 600));
        aux.add(new OcupacaoVariable("COMP0412", "17:30", TERCA, AULA, 600));
        aux.add(new OcupacaoVariable("COMP0412", "18:00", TERCA, AULA, 600));
        aux.add(new OcupacaoVariable("COMP0412", "18:30", TERCA, AULA, 600));
        aux.add(new OcupacaoVariable("Lanche", "19:00", TERCA, ALIMENTACAO, 1001));

        aux.add(new OcupacaoVariable("MAT0154", "13:00", QUARTA, AULA, 700));
        aux.add(new OcupacaoVariable("MAT0154", "13:30", QUARTA, AULA, 700));
        aux.add(new OcupacaoVariable("MAT0154", "14:00", QUARTA, AULA, 700));
        aux.add(new OcupacaoVariable("MAT0154", "14:30", QUARTA, AULA, 700));

        aux.add(new OcupacaoVariable("ESTAT0011", "15:00", QUARTA, AULA, 800));
        aux.add(new OcupacaoVariable("ESTAT0011", "15:30", QUARTA, AULA, 800));
        aux.add(new OcupacaoVariable("ESTAT0011", "16:00", QUARTA, AULA, 800));
        aux.add(new OcupacaoVariable("ESTAT0011", "16:30", QUARTA, AULA, 800));

        aux.add(new OcupacaoVariable("COMP0415", "17:00", QUARTA, AULA, 900));
        aux.add(new OcupacaoVariable("COMP0415", "17:30", QUARTA, AULA, 900));
        aux.add(new OcupacaoVariable("COMP0415", "18:00", QUARTA, AULA, 900));
        aux.add(new OcupacaoVariable("COMP0415", "18:30", QUARTA, AULA, 900));
        aux.add(new OcupacaoVariable("Lanche", "19:00", QUARTA, ALIMENTACAO, 1002));

        aux.add(new OcupacaoVariable("MAT0096", "13:00", QUINTA, AULA, 920));
        aux.add(new OcupacaoVariable("MAT0096", "13:30", QUINTA, AULA, 921));
        aux.add(new OcupacaoVariable("MAT0096", "14:00", QUINTA, AULA, 922));
        aux.add(new OcupacaoVariable("MAT0096", "14:30", QUINTA, AULA, 923));

        aux.add(new OcupacaoVariable("COMP0409", "15:00", QUINTA, AULA, 901));
        aux.add(new OcupacaoVariable("COMP0409", "15:30", QUINTA, AULA, 902));
        aux.add(new OcupacaoVariable("COMP0409", "16:00", QUINTA, AULA, 903));
        aux.add(new OcupacaoVariable("COMP0409", "16:30", QUINTA, AULA, 904));

        aux.add(new OcupacaoVariable("COMP0412", "17:00", QUINTA, AULA, 905));
        aux.add(new OcupacaoVariable("COMP0412", "17:30", QUINTA, AULA, 906));
        aux.add(new OcupacaoVariable("COMP0412", "18:00", QUINTA, AULA, 907));
        aux.add(new OcupacaoVariable("COMP0412", "18:30", QUINTA, AULA, 908));
        aux.add(new OcupacaoVariable("Lanche", "19:00", QUINTA, ALIMENTACAO, 1003));

        aux.add(new OcupacaoVariable("MAT0154", "13:00", SEXTA, AULA, 909));
        aux.add(new OcupacaoVariable("MAT0154", "13:30", SEXTA, AULA, 910));
        aux.add(new OcupacaoVariable("MAT0154", "14:00", SEXTA, AULA, 911));
        aux.add(new OcupacaoVariable("MAT0154", "14:30", SEXTA, AULA, 912));
        aux.add(new OcupacaoVariable("Lanche", "15:00", SEXTA, ALIMENTACAO, 1004));

        aux.add(new OcupacaoVariable("COMP0417", "17:00", SEXTA, AULA, 913));
        aux.add(new OcupacaoVariable("COMP0417", "17:30", SEXTA, AULA, 914));
        aux.add(new OcupacaoVariable("COMP0417", "18:00", SEXTA, AULA, 915));
        aux.add(new OcupacaoVariable("COMP0417", "18:30", SEXTA, AULA, 916));
        return aux;
    }

    private static List<OcupacaoVariable> buildPibit() {
        return OcupacaoBuilder.buildOcupacao("PIBIT", EXTENSAO, 5000);
    }

}


