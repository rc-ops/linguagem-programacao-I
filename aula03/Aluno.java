package com.aulasjava.universidade.aula03;

public class Aluno {
    private String nome;
    private String nomeCurso;
    private int periodo;
    private double nota1;
    private double nota2;
    private int quantFaltas;
    private double media;

    public Aluno() {
    }

    public Aluno(String nome, String nomeCurso, int periodo, double nota1, double nota2, int quantFaltas) {
        this.nome = nome;
        this.nomeCurso = nomeCurso;
        this.periodo = periodo;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.quantFaltas = quantFaltas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNomeCurso() {
        return nomeCurso;
    }

    public void setNomeCurso(String nomeCurso) {
        this.nomeCurso = nomeCurso;
    }

    public int getPeriodo() {
        return periodo;
    }

    public void setPeriodo(int periodo) {
        this.periodo = periodo;
    }

    public double getNota1() {
        return nota1;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    public int getQuantFaltas() {
        return quantFaltas;
    }

    public void setQuantFaltas(int quantFaltas) {
        this.quantFaltas = quantFaltas;
    }

    public double getMedia() {
        return media;
    }

    public void setMedia(double media) {
        this.media = media;
    }
}
