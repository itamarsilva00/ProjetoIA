package main.aima.domain;

public enum TipoOcupacao {
    ESTUDO("\u001B[32m"),
    AULA("\u001B[34m"),
    EXTENSAO("\u001B[33m"),
    ALIMENTACAO("\u001B[35m"),
    TRABALHO("\u001B[36m"),
    OUTROS("\u001B[31m");

    public final String cor;

    TipoOcupacao(String cor) {
        this.cor = cor;
    }
}

