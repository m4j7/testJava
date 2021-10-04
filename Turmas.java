package com.company;
import java.util.ArrayList;
import java.util.List;

public class Turmas {

    private int id;
    private List<Alunos> alunos = new ArrayList<Alunos>();

    public Turmas(int id) {
        this.id = id;
    }

    public List<Alunos> getAlunos() {
        return alunos;
    }

    public void setAlunos(List<Alunos> alunos) {
        this.alunos = alunos;
    }

    @Override
    public String toString() {
        return "Turmas{" +
                "id=" + id +
                ", alunos=" + alunos +
                '}';
    }
}
