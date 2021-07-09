package main.aima.builder.ocupacao;

import main.aima.domain.DiaSemana;
import main.aima.variable.OcupacaoVariable;

import java.util.ArrayList;
import java.util.List;

import static main.aima.domain.DiaSemana.SEGUNDA;
import static main.aima.domain.DiaSemana.TERCA;
import static main.aima.domain.TipoOcupacao.ALIMENTACAO;

public class AlmocoBuilder {

    public static List<OcupacaoVariable> buildAlmoco() {
        List<OcupacaoVariable> aux = new ArrayList<>();

        aux.add(new OcupacaoVariable("Almoço", "12:00", SEGUNDA, ALIMENTACAO, 2001));
        aux.add(new OcupacaoVariable("Almoço", "12:00", TERCA, ALIMENTACAO, 2002));
        aux.add(new OcupacaoVariable("Almoço", "12:00", DiaSemana.QUARTA, ALIMENTACAO, 2003));
        aux.add(new OcupacaoVariable("Almoço", "12:00", DiaSemana.QUINTA, ALIMENTACAO, 2004));
        aux.add(new OcupacaoVariable("Almoço", "12:00", DiaSemana.SEXTA, ALIMENTACAO, 2005));
        aux.add(new OcupacaoVariable("Almoço", "12:00", DiaSemana.SABADO, ALIMENTACAO, 2006));
        return aux;
    }
}
