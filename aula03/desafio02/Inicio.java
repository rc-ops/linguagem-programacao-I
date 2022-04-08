package com.aulasjava.universidade.aula03.desafio02;

import java.util.Scanner;
public class Inicio {
    static Aluno aluno = new Aluno();
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Insira a primeira nota: ");
        aluno.setNota1(scan.nextDouble());
        System.out.print("Insira a segunda nota: ");
        aluno.setNota2(scan.nextDouble());
        Operacoes.calculoMedia(aluno.getNota1(),aluno.getNota2());
        System.out.println("Média do aluno: " + aluno.getMedia());
        System.out.println("Resultado: " + aluno.getSituacao());
    }
}
