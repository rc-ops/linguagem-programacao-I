package com.aulasjava.universidade.aula03.desafio02;

public class Aluno {
    private String situacao;
    private double nota1;
    private double nota2;
    private double media;

    public Aluno(String situacao, double nota1, double nota2, double media) {
        this.situacao = situacao;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.media = media;
    }

    public Aluno() {
    }

    public String getSituacao() {
        return situacao;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
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

    public double getMedia() {
        return media;
    }

    public void setMedia(double media) {
        this.media = media;
    }
}
