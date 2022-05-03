package com.aulasjava.universidade.aula06.pratica;

public class TestaOperacaoMatematica {
    public static void main(String[] args) {
        calculaOperacao(new Soma(), 2500, 200);
        calculaOperacao(new Multiplicacao(), 67, 970);
        calculaOperacao(new Divisao(), 76, 123);
        calculaOperacao(new Subtracao(), 155, 68);
    }

    public static void calculaOperacao(OperacaoMatematica o, double x, double y){
        System.out.println(o.calcular(x, y));
    }
}
