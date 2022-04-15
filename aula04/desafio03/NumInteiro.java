package com.aulasjava.universidade.aula04.desafio03;

import java.util.Scanner;

public class NumInteiro {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Insira um número: ");
        int num = scan.nextInt();
        if (num % 2 == 0){
            System.out.println("O número inserido é par. ");
        } else{
            System.out.println("O número inserido é ímpar");
        }
    }
}
