package br.model;

public class Sala {
    private long id;
    private String assento;
    private long capacidade;

    public Sala() {
    }

    public Sala(long id, String assento, long capacidade) {
        this.id = id;
        this.assento = assento;
        this.capacidade = capacidade;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getAssento() {
        return assento;
    }

    public void setAssento(String assento) {
        this.assento = assento;
    }

    public long getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(long capacidade) {
        this.capacidade = capacidade;
    }
}
