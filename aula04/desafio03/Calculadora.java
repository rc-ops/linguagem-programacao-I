package com.aulasjava.universidade.aula04.desafio03;

import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Insira um número: ");
        int n1 = sc.nextInt();
        System.out.print("Insira um número: ");
        int n2 = sc.nextInt();
        System.out.print("Insira um número: ");
        int n3 = sc.nextInt();
        menorNumero(n1, n2, n3);
    }
    private static void menorNumero(int n1, int n2, int n3){
        int menor = 0;
        if (n1 < n2 && n1 < n3){
            menor = n1;
        } else if (n2 < n1 && n2 < n3){
            menor = n2;
        } else if (n3 < n1 && n3 < n2){
            menor = n3;
        }
        System.out.println("O menor número é " + menor);
    }
}
