package main.aima.domain;

import java.util.Objects;

public class HorarioDomain {

    private String titulo;
    private DiaSemana diaSemana;
    private long ordem;

    public long getOrdem() {
        return ordem;
    }

    public HorarioDomain(String titulo, DiaSemana diaSemana, long ordem) {
        this.titulo = titulo;
        this.diaSemana = diaSemana;
        this.ordem = ordem;
    }

    @Override
    public String toString() {
        return titulo + " " + diaSemana;
    }

    @Override
    public int hashCode() {
        return Objects.hash(titulo, diaSemana);
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public DiaSemana getDiaSemana() {
        return diaSemana;
    }

    public void setDiaSemana(DiaSemana diaSemana) {
        this.diaSemana = diaSemana;
    }

}
