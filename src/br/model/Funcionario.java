package br.model;

import java.util.Date;

public class Funcionario {
    private long id;
    private String nome;
    private long cpf;
    private Date datacontratacao;
    private int telefone;

    public Funcionario() {
    }

    public Funcionario(long id, String nome, long cpf, Date datacontratacao, int telefone) {
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
        this.datacontratacao = datacontratacao;
        this.telefone = telefone;
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

    public long getCpf() {
        return cpf;
    }

    public void setCpf(long cpf) {
        this.cpf = cpf;
    }

    public Date getDatacontratacao() {
        return datacontratacao;
    }

    public void setDatacontratacao(Date datacontratacao) {
        this.datacontratacao = datacontratacao;
    }

    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }
}
