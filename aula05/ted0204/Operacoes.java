package com.aulasjava.universidade.aula05.ted0204;

public class Operacoes {
    private int maiorNum;
    private int menorNum;

    public int getMaiorNum() {
        return maiorNum;
    }

    public void setMaiorNum(int maiorNum) {
        this.maiorNum = maiorNum;
    }

    public int getMenorNum() {
        return menorNum;
    }

    public void setMenorNum(int menorNum) {
        this.menorNum = menorNum;
    }

    public void retornaMaiorMenorNum(int[] array){
        setMaiorNum(array[0]);
        setMenorNum(array[0]);
        for (int num : array) {
            if (num > getMaiorNum()) {
                setMaiorNum(num);
            } else if (num < getMenorNum()) {
                setMenorNum(num);
            }
        }
        System.out.println("Maior número: " + getMaiorNum());
        System.out.println("Menor número: " + getMenorNum());
    }

    public int retornaSomaValores(int[] array){
        int soma = 0;
        for (int n : array){
            soma += n;
        }
        return soma;
    }

    public int somaNumerosPares(int[] array){
        int soma = 0;
        for (int n : array){
            if (n % 2 == 0){
                soma += n;
            }
        }
        return soma;
    }
}
