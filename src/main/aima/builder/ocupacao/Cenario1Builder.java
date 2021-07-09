package main.aima.builder.ocupacao;

import main.aima.domain.DiaSemana;
import main.aima.domain.TipoOcupacao;
import main.aima.variable.OcupacaoVariable;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static main.aima.domain.DiaSemana.SEGUNDA;
import static main.aima.domain.DiaSemana.TERCA;
import static main.aima.domain.TipoOcupacao.*;

public class Cenario1Builder {

    public static List<OcupacaoVariable> buildCenario() {
        List<OcupacaoVariable> aux = new ArrayList<>(AlmocoBuilder.buildAlmoco());
        aux.addAll(buildPibic());

//        aux.add(new OcupacaoVariable("Lanche", "17:00", SEGUNDA, ALIMENTACAO, 1000));
//        aux.add(new OcupacaoVariable("Lanche", "17:00", TERCA, ALIMENTACAO, 1001));
//        aux.add(new OcupacaoVariable("Lanche", "17:00", DiaSemana.QUARTA, ALIMENTACAO, 1002));
//        aux.add(new OcupacaoVariable("Lanche", "17:00", DiaSemana.QUINTA, ALIMENTACAO, 1003));
//        aux.add(new OcupacaoVariable("Lanche", "17:00", DiaSemana.SEXTA, ALIMENTACAO, 1004));
//        aux.add(new OcupacaoVariable("Lanche", "17:00", DiaSemana.SABADO, ALIMENTACAO, 1005));
//
//        aux.add(new OcupacaoVariable("Atividade voluntária", "13:00", SEGUNDA, OUTROS, 6000));
//        aux.add(new OcupacaoVariable("Atividade voluntária", "13:30", SEGUNDA, OUTROS, 6000));
//        aux.add(new OcupacaoVariable("Atividade voluntária", "14:00", SEGUNDA, OUTROS, 6000));
//        aux.add(new OcupacaoVariable("Atividade voluntária", "14:30", SEGUNDA, OUTROS, 6000));
//
//        aux.add(new OcupacaoVariable("COMP0408", "21:00", SEGUNDA, AULA, 100));
//        aux.add(new OcupacaoVariable("COMP0408", "21:30", SEGUNDA, AULA, 100));
//        aux.add(new OcupacaoVariable("COMP0408", "22:00", SEGUNDA, AULA, 100));
//        aux.add(new OcupacaoVariable("COMP0408", "22:30", SEGUNDA, AULA, 100));
//
//        aux.add(new OcupacaoVariable("COMP0455", "15:00", TERCA, AULA, 200));
//        aux.add(new OcupacaoVariable("COMP0455", "15:30", TERCA, AULA, 200));
//        aux.add(new OcupacaoVariable("COMP0455", "16:00", TERCA, AULA, 200));
//        aux.add(new OcupacaoVariable("COMP0455", "16:30", TERCA, AULA, 200));
//
//        aux.add(new OcupacaoVariable("COMP0408", "21:00", DiaSemana.QUARTA, AULA, 300));
//        aux.add(new OcupacaoVariable("COMP0408", "21:30", DiaSemana.QUARTA, AULA, 300));
//        aux.add(new OcupacaoVariable("COMP0408", "22:00", DiaSemana.QUARTA, AULA, 300));
//        aux.add(new OcupacaoVariable("COMP0408", "22:30", DiaSemana.QUARTA, AULA, 300));
//
//        aux.add(new OcupacaoVariable("COMP0455", "15:00", DiaSemana.QUINTA, AULA, 400));
//        aux.add(new OcupacaoVariable("COMP0455", "15:30", DiaSemana.QUINTA, AULA, 400));
//        aux.add(new OcupacaoVariable("COMP0455", "16:00", DiaSemana.QUINTA, AULA, 400));
//        aux.add(new OcupacaoVariable("COMP0455", "16:30", DiaSemana.QUINTA, AULA, 400));
//
//        aux.add(new OcupacaoVariable("COMP0481", "19:00", DiaSemana.QUINTA, AULA, 500));
//        aux.add(new OcupacaoVariable("COMP0481", "19:30", DiaSemana.QUINTA, AULA, 500));
//        aux.add(new OcupacaoVariable("COMP0481", "20:00", DiaSemana.QUINTA, AULA, 500));
//        aux.add(new OcupacaoVariable("COMP0481", "20:30", DiaSemana.QUINTA, AULA, 500));
        return aux;
    }

    private static List<OcupacaoVariable> buildPibic() {
        return OcupacaoBuilder.buildOcupacao("PIBIC", EXTENSAO, 5000);
    }

}
