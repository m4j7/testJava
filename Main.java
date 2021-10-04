package com.company;

public class Main {

    public static void main(String[] args) {

        Alunos a1 = new Alunos("maria", 14,true);
        Alunos a2 = new Alunos("julia", 14,false);

        Turmas t1 = new Turmas(23);

        t1.getAlunos().add(a1);
        t1.getAlunos().add(a2);

        System.out.println(t1);
    }
}
