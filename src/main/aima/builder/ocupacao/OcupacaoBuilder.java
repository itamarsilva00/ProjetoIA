package main.aima.builder.ocupacao;

import main.aima.domain.DiaSemana;
import main.aima.domain.TipoOcupacao;
import main.aima.variable.OcupacaoVariable;

import java.util.ArrayList;
import java.util.List;

public class OcupacaoBuilder {

    static List<OcupacaoVariable> buildOcupacao(String nome, TipoOcupacao tipoOcupacao, int inicio) {
        List<OcupacaoVariable> aux = new ArrayList<>();

        DiaSemana[] values = DiaSemana.values();
        for (int i = 0, valuesLength = values.length - 1; i < valuesLength; i++) {
            DiaSemana consumer = values[i];
            aux.add(new OcupacaoVariable(nome, "8:00", consumer, tipoOcupacao, inicio++));
            aux.add(new OcupacaoVariable(nome, "8:30", consumer, tipoOcupacao, inicio++));
            aux.add(new OcupacaoVariable(nome, "9:00", consumer, tipoOcupacao, inicio++));
            aux.add(new OcupacaoVariable(nome, "9:30", consumer, tipoOcupacao, inicio++));
            aux.add(new OcupacaoVariable(nome, "10:00", consumer, tipoOcupacao, inicio++));
            aux.add(new OcupacaoVariable(nome, "10:30", consumer, tipoOcupacao, inicio++));
            aux.add(new OcupacaoVariable(nome, "11:00", consumer, tipoOcupacao, inicio++));
            aux.add(new OcupacaoVariable(nome, "11:30", consumer, tipoOcupacao, inicio++));
        }
        return aux;
    }

}
