package com.aulasjava.universidade.aula04;

import java.util.Scanner;

public class While {
    public static void main(String[] args) {
        int numero = (int) (Math.random() * 10);
        Scanner sc = new Scanner(System.in);
        int tentativas = 1;
        while (true){
            System.out.print("Informe um número de 0 a 10: ");
            int escolha = sc.nextInt();
            if (escolha > numero){
                System.out.println("Errou! Informe um número menor.");
                tentativas++;
            } else if (escolha < numero) {
                System.out.println("Errou! Informe um número maior");
                tentativas++;
            } else{
                break;
            }
        }
        System.out.println("Parabéns! Você acertou em " + tentativas + " tentativas.");
    }
}
