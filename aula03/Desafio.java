package com.aulasjava.universidade.aula03;

import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Insira o seu nome completo: ");
        String nome = scan.nextLine();

        System.out.print("Insira o nome do curso: ");
        String curso = scan.nextLine();

        System.out.print("Número do período: ");
        int periodo = scan.nextInt();

        System.out.print("Insira o valor da primeira nota: ");
        double nota1 = scan.nextDouble();

        System.out.print("Insira o valor da segunda nota: ");
        double nota2 = scan.nextDouble();
        double media = calculaMedia(nota1, nota2);

        System.out.print("Quantidade de faltas: ");
        int quantFaltas = scan.nextInt();

        mostraInfo(nome, curso, periodo, media, quantFaltas);

    }
    public static double calculaMedia(double nota1, double nota2){
        return (nota1+nota2)/2;
    }

    public static void mostraInfo(String nome, String curso, int periodo, double media, int quantFaltas){
        System.out.println("Informações inseridas: ");
        System.out.println("Nome completo: " + nome);
        System.out.println("Nome do curso: " + curso);
        System.out.println("Período: " + periodo + "º");
        System.out.println("Média: " + media);
        System.out.println("Quantidade de faltas: " + quantFaltas);
    }

}
