package main.aima.domain;

import java.util.Objects;

public class HorarioDomain {

    private final HoraDiaSemana horaDiaSemana;

    public HorarioDomain(String titulo, DiaSemana diaSemana) {
        this.horaDiaSemana = new HoraDiaSemana(titulo, diaSemana);
    }

    @Override
    public String toString() {
        return this.horaDiaSemana.getHora() + " " + this.horaDiaSemana.getDiaSemana();
    }

    public HoraDiaSemana getHoraDiaSemana() {
        return horaDiaSemana;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        HorarioDomain that = (HorarioDomain) o;
        return Objects.equals(horaDiaSemana, that.horaDiaSemana);
    }

    @Override
    public int hashCode() {
        return Objects.hash(horaDiaSemana);
    }
}
