package br.model;

import java.util.Date;

public class Ingresso {
    private long id;
    private Enum tipoingresso;
    private float valoringresso;
    private Filme filme;
    private Sessao sessao;
    private Date horario;
    private Sala sala;
    private String assento;

    public Ingresso() {
    }

    public Ingresso(long id, Enum tipoingresso, float valoringresso, Filme filme, Sessao sessao, Date horario, Sala sala, String assento) {
        this.id = id;
        this.tipoingresso = tipoingresso;
        this.valoringresso = valoringresso;
        this.filme = filme;
        this.sessao = sessao;
        this.horario = horario;
        this.sala = sala;
        this.assento = assento;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Enum getTipoingresso() {
        return tipoingresso;
    }

    public void setTipoingresso(Enum tipoingresso) {
        this.tipoingresso = tipoingresso;
    }

    public float getValoringresso() {
        return valoringresso;
    }

    public void setValoringresso(float valoringresso) {
        this.valoringresso = valoringresso;
    }

    public Filme getFilme() {
        return filme;
    }

    public void setFilme(Filme filme) {
        this.filme = filme;
    }

    public Sessao getSessao() {
        return sessao;
    }

    public void setSessao(Sessao sessao) {
        this.sessao = sessao;
    }

    public Date getHorario() {
        return horario;
    }

    public void setHorario(Date horario) {
        this.horario = horario;
    }

    public Sala getSala() {
        return sala;
    }

    public void setSala(Sala sala) {
        this.sala = sala;
    }

    public String getAssento() {
        return assento;
    }

    public void setAssento(String assento) {
        this.assento = assento;
    }
}
