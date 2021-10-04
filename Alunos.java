package com.company;

public class Alunos {

    private String nome;
    private int numero;
    private boolean ativo;

    public Alunos(String nome, int numero, boolean ativo) {
        this.nome = nome;
        this.numero = numero;
        this.ativo = ativo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Alunos{" +
                "nome='" + nome + '\'' +
                ", numero=" + numero +
                ", ativo=" + ativo +
                '}';
    }
}
