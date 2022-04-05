package com.aulasjava.universidade.aula03;

import java.util.Scanner;

public class OperacoesAluno {
    Aluno aluno1;
    public void cadastrarAluno(){
        Scanner scan = new Scanner(System.in);

        System.out.print("Insira o seu nome completo: ");
        String nome = scan.nextLine();

        System.out.print("Insira o nome do curso: ");
        String nomeCurso = scan.nextLine();

        System.out.print("Número do período: ");
        int periodo = scan.nextInt();

        System.out.print("Insira o valor da primeira nota: ");
        double nota1 = scan.nextDouble();

        System.out.print("Insira o valor da segunda nota: ");
        double nota2 = scan.nextDouble();

        System.out.print("Quantidade de faltas: ");
        int quantFaltas = scan.nextInt();

        aluno1 = new Aluno(nome, nomeCurso, periodo, nota1, nota2, quantFaltas);
    }

    public double obterMedia(){
        double media = ((aluno1.getNota1()) + aluno1.getNota2())/2;
        aluno1.setMedia(media);
        return media;
    }

    public int obterFaltas(){
        return aluno1.getQuantFaltas();
    }

    public void mostraInfo(){
        System.out.println("Informações inseridas: ");
        System.out.println("Nome completo: " + aluno1.getNome());
        System.out.println("Nome do curso: " + aluno1.getNomeCurso());
        System.out.println("Período: " + aluno1.getPeriodo() + "º");
        System.out.println("Média: " + aluno1.getMedia());
        System.out.println("Quantidade de faltas: " + aluno1.getQuantFaltas());
    }
}
