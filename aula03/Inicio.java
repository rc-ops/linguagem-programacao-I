package com.aulasjava.universidade.aula03;

import java.util.Scanner;

public class Inicio {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        mostrarMenu();
        System.out.print("Digite o número correspondente à opção desejada: ");
        int opcao = scan.nextInt();
        OperacoesAluno operacao = new OperacoesAluno();
        switch (opcao) {
            case 1 -> operacao.cadastrarAluno();
            case 2 -> operacao.obterMedia();
            case 3 -> operacao.obterFaltas();
            case 4 -> operacao.mostraInfo();
            case 5 -> System.out.println("Você saiu do sistema. Até logo.");
        }

    }

    private static void mostrarMenu(){
        System.out.println("Bem vindo ao sistema de cadastro de alunos.");
        System.out.println("Abaixo tens as opções disponíveis.");
        System.out.println("1 - Cadastrar aluno");
        System.out.println("2 - Obter média do aluno previamente cadastrado");
        System.out.println("3 - Ver quantidade de faltas do aluno");
        System.out.println("4 - Ver todas as informações cadastradas do aluno.");
        System.out.println("5 - Sair");
    }

}
