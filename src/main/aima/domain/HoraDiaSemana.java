package main.aima.domain;

import java.util.Objects;

public class HoraDiaSemana {

    private String hora;
    private DiaSemana diaSemana;

    public HoraDiaSemana(String hora, DiaSemana diaSemana) {
        this.hora = hora;
        this.diaSemana = diaSemana;
    }

    public String getHora() {
        return hora;
    }

    public long getOrdem() {
        long aux = 0;
        switch (getDiaSemana()) {
            case SEGUNDA:
                aux = 10;
                break;

            case TERCA:
                aux = 100;
                break;

            case QUARTA:
                aux = 1000;
                break;

            case QUINTA:
                aux = 10000;
                break;

            case SEXTA:
                aux = 100000;
                break;

            case SABADO:
                aux = 1000000;
                break;
        }

        return (long) Integer.parseInt(getHora().replace(":", "")) * aux;
    }
    public DiaSemana getDiaSemana() {
        return diaSemana;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        HoraDiaSemana that = (HoraDiaSemana) o;
        return Objects.equals(hora, that.hora) && diaSemana == that.diaSemana;
    }

    @Override
    public int hashCode() {
        return Objects.hash(hora, diaSemana);
    }
}
