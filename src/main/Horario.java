package main;

public class Horario {

    private String titulo;
    private DiaSemana diaSemana;

    public Horario(String titulo, DiaSemana diaSemana) {
        this.titulo = titulo;
        this.diaSemana = diaSemana;
    }

    @Override
    public String toString() {
        return titulo + " " + diaSemana;
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
