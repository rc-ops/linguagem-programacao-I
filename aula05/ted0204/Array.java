package com.aulasjava.universidade.aula05.ted0204;

import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Operacoes op = new Operacoes();
        int[] numeros = new int[10];
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Insira um número: ");
            numeros[i] = sc.nextInt();
        }

        op.retornaMaiorMenorNum(numeros);
        System.out.println("Soma de todos os números inseridos: " + op.retornaSomaValores(numeros));
        System.out.println("Soma de todos os números pares: " + op.somaNumerosPares(numeros));
    }
}
