package br.model;

public class Cliente {
    private long id;
    private String nome;
    private int telefone;
    private long cpf;
    private int idade;
    private boolean elegivelmeia;

    public Cliente() {
    }

    public Cliente(long id, String nome, int telefone, long cpf, int idade, boolean elegivelmeia) {
        this.id = id;
        this.nome = nome;
        this.telefone = telefone;
        this.cpf = cpf;
        this.idade = idade;
        this.elegivelmeia = elegivelmeia;
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

    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    public long getCpf() {
        return cpf;
    }

    public void setCpf(long cpf) {
        this.cpf = cpf;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public boolean isElegivelmeia() {
        return elegivelmeia;
    }

    public void setElegivelmeia(boolean elegivelmeia) {
        this.elegivelmeia = elegivelmeia;
    }
}
