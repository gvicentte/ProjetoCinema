package br.model;

import java.util.Date;
import java.util.List;

public class Sessao {
    private long id;
    private boolean disponivel;
    private List<Ingresso> ingressoList;
    private Filme filmesessao;
    private Date horariosessao;
    private Sala sala;

    public Sessao() {
    }

    public Sessao(long id, boolean disponivel, List<Ingresso> ingressoList, Filme filmesessao, Date horariosessao, Sala sala) {
        this.id = id;
        this.disponivel = disponivel;
        this.ingressoList = ingressoList;
        this.filmesessao = filmesessao;
        this.horariosessao = horariosessao;
        this.sala = sala;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }

    public List<Ingresso> getIngressoList() {
        return ingressoList;
    }

    public void setIngressoList(List<Ingresso> ingressoList) {
        this.ingressoList = ingressoList;
    }

    public Filme getFilmesessao() {
        return filmesessao;
    }

    public void setFilmesessao(Filme filmesessao) {
        this.filmesessao = filmesessao;
    }

    public Date getHorariosessao() {
        return horariosessao;
    }

    public void setHorariosessao(Date horariosessao) {
        this.horariosessao = horariosessao;
    }

    public Sala getSala() {
        return sala;
    }

    public void setSala(Sala sala) {
        this.sala = sala;
    }
}
