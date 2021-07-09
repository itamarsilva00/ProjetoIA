package main.aima.builder;

import main.aima.domain.DiaSemana;
import main.aima.variable.OcupacaoVariable;

import java.util.ArrayList;
import java.util.List;

public class OcupacaoBuilder {

    private static List<OcupacaoVariable> buildAlmoco() {
        List<OcupacaoVariable> aux = new ArrayList<>();

//        aux.add(new OcupacaoVariable("Almoço", "12:00", DiaSemana.SEGUNDA, 2001));
//        aux.add(new OcupacaoVariable("Almoço", "12:00", DiaSemana.TERCA, 2002));
//        aux.add(new OcupacaoVariable("Almoço", "12:00", DiaSemana.QUARTA, 2003));
//        aux.add(new OcupacaoVariable("Almoço", "12:00", DiaSemana.QUINTA, 2004));
//        aux.add(new OcupacaoVariable("Almoço", "12:00", DiaSemana.SEXTA, 2005));
//        aux.add(new OcupacaoVariable("Almoço", "12:00", DiaSemana.SABADO, 2006));
        return aux;
    }

    public static List<OcupacaoVariable> buildCenario1() {
        List<OcupacaoVariable> aux = new ArrayList<>(buildAlmoco());

        aux.add(new OcupacaoVariable("Lanche", "17:00", DiaSemana.SEGUNDA, 1000));
        aux.add(new OcupacaoVariable("Lanche", "17:00", DiaSemana.TERCA, 1001));
        aux.add(new OcupacaoVariable("Lanche", "17:00", DiaSemana.QUARTA, 1002));
        aux.add(new OcupacaoVariable("Lanche", "17:00", DiaSemana.QUINTA, 1003));
        aux.add(new OcupacaoVariable("Lanche", "17:00", DiaSemana.SEXTA, 1004));
        aux.add(new OcupacaoVariable("Lanche", "17:00", DiaSemana.SABADO, 1005));
//
        aux.add(new OcupacaoVariable("COMP0408", "21:00", DiaSemana.SEGUNDA, 100));
        aux.add(new OcupacaoVariable("COMP0408", "21:30", DiaSemana.SEGUNDA, 100));
        aux.add(new OcupacaoVariable("COMP0408", "22:00", DiaSemana.SEGUNDA, 100));
        aux.add(new OcupacaoVariable("COMP0408", "22:30", DiaSemana.SEGUNDA, 100));

        aux.add(new OcupacaoVariable("COMP0455", "15:00", DiaSemana.TERCA, 200));
        aux.add(new OcupacaoVariable("COMP0455", "15:30", DiaSemana.TERCA, 200));
        aux.add(new OcupacaoVariable("COMP0455", "16:00", DiaSemana.TERCA, 200));
        aux.add(new OcupacaoVariable("COMP0455", "16:30", DiaSemana.TERCA, 200));

        aux.add(new OcupacaoVariable("COMP0408", "21:00", DiaSemana.QUARTA, 300));
        aux.add(new OcupacaoVariable("COMP0408", "21:30", DiaSemana.QUARTA, 300));
        aux.add(new OcupacaoVariable("COMP0408", "22:00", DiaSemana.QUARTA, 300));
        aux.add(new OcupacaoVariable("COMP0408", "22:30", DiaSemana.QUARTA, 300));

        aux.add(new OcupacaoVariable("COMP0455", "15:00", DiaSemana.QUINTA, 400));
        aux.add(new OcupacaoVariable("COMP0455", "15:30", DiaSemana.QUINTA, 400));
        aux.add(new OcupacaoVariable("COMP0455", "16:00", DiaSemana.QUINTA, 400));
        aux.add(new OcupacaoVariable("COMP0455", "16:30", DiaSemana.QUINTA, 400));

        aux.add(new OcupacaoVariable("COMP0481", "19:00", DiaSemana.QUINTA, 500));
        aux.add(new OcupacaoVariable("COMP0481", "19:30", DiaSemana.QUINTA, 500));
        aux.add(new OcupacaoVariable("COMP0481", "20:00", DiaSemana.QUINTA, 500));
        aux.add(new OcupacaoVariable("COMP0481", "20:30", DiaSemana.QUINTA, 500));
        return aux;
    }
}
