package com.aulasjava.universidade.aula04;

import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int pos = 0;
        int neg = 0;
        int escolha;
        int soma = 0;
        int total = 0;
        do {
            System.out.print("Informe um número inteiro (0 para sair): ");
            escolha = scan.nextInt();
            if (escolha > 0) {
                pos++;
                total += 1;
                soma += escolha;
            } else if (escolha < 0) {
                neg++;
                total += 1;
                soma += escolha;
            }
        } while (escolha != 0);
        System.out.println("Quantidade de números positivos: " + pos);
        System.out.println("Quantidade de números negativos: " + neg);
        System.out.println("A soma dos números lidos é: " + soma);
        System.out.println("A média aritmética é: " + (double) (soma/total));
    }
}
