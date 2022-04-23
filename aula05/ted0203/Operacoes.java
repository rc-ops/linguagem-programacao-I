package com.aulasjava.universidade.aula05.ted0203;

public class Operacoes {
    private double maiorAlt;
    private double menorAlt;
    private int totMas;
    private int totFem;

    public Operacoes() {
    }

    public double getMaiorAlt() {
        return maiorAlt;
    }

    public void setMaiorAlt(double maiorAlt) {
        this.maiorAlt = maiorAlt;
    }

    public double getMenorAlt() {
        return menorAlt;
    }

    public void setMenorAlt(double menorAlt) {
        this.menorAlt = menorAlt;
    }

    public int getTotMas() {
        return totMas;
    }

    public void setTotMas(int totMas) {
        this.totMas = totMas;
    }

    public int getTotFem() {
        return totFem;
    }

    public void setTotFem(int totFem) {
        this.totFem = totFem;
    }

    public void retornaMaiorMenorAlt(double[] array){
        setMaiorAlt(array[0]);
        setMenorAlt(array[0]);
        for (double alt : array) {
            if (alt > getMaiorAlt()) {
                setMaiorAlt(alt);
            } else if (alt < getMenorAlt()) {
                setMenorAlt(alt);
            }
        }
        System.out.println("Maior altura: " + getMaiorAlt());
        System.out.println("Menor altura: " + getMenorAlt());
    }

    public double calculaMedia(double[] array){
        double soma = 0;
        int tot = 0;
        for (double alt : array){
            soma += alt;
            tot ++;
        }
        return (soma/tot);
    }

    public int contaFeminino(double[] array){
        int tot = 0;
        for (double mulher : array){
            tot++;
        }
        return tot;
    }

}

