package br.model;

import java.util.List;

public class Filme {
    private long id;
    private String nome;
    private String genero;
    private String diretor;
    private String descricao;
    private String classificacao;
    private List<String> elenco;
    private long duracao;

    public Filme() {
    }

    public Filme(long id, String nome, String genero, String diretor, String descricao, String classificacao, List<String> elenco, long duracao) {
        this.id = id;
        this.nome = nome;
        this.genero = genero;
        this.diretor = diretor;
        this.descricao = descricao;
        this.classificacao = classificacao;
        this.elenco = elenco;
        this.duracao = duracao;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getClassificacao() {
        return classificacao;
    }

    public void setClassificacao(String classificacao) {
        this.classificacao = classificacao;
    }

    public List<String> getElenco() {
        return elenco;
    }

    public void setElenco(List<String> elenco) {
        this.elenco = elenco;
    }

    public long getDuracao() {
        return duracao;
    }

    public void setDuracao(long duracao) {
        this.duracao = duracao;
    }
}
