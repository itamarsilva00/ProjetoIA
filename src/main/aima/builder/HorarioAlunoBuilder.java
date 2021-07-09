package main.aima.builder;

import main.aima.domain.DiaSemana;
import main.aima.domain.HorarioDomain;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class HorarioAlunoBuilder {

    public static List<HorarioDomain> build(int horaInicio, int horaFim) {
        if (horaFim < horaInicio) {
            System.out.println("Hora de ínicio não pode ser menor que a hora de término");
            return Collections.emptyList();
        }

        var quantidade = (horaFim - horaInicio);
        var aux = new ArrayList<HorarioDomain>(quantidade);

        for (int i = 0; i < 6; i++) {
            DiaSemana diaSemana = DiaSemana.values()[i];
            int j;
            for (j = 0; j < quantidade; j++) {
                String a = (j + horaInicio) + ":00";
                String b = (j + horaInicio) + ":30";

                aux.add(new HorarioDomain(a, diaSemana));
                aux.add(new HorarioDomain(b, diaSemana));
            }

            String a = (j + horaInicio) + ":00";
            aux.add(new HorarioDomain(a, diaSemana));
        }
        return aux;
    }
}
