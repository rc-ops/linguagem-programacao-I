package com.aulasjava.universidade.aula05.ted0203;

import java.util.Scanner;

public class ForIfElse {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        Operacoes op = new Operacoes();
        // double altura;
        // String sexo;
        double[] alturasF = {1.67, 1.66, 1.72, 1.80, 1.42, 1.76};
        double[] alturasM = {1.79, 1.80, 1.98, 1.59};
        double[] alturasGrupo = {1.67, 1.66, 1.72, 1.80, 1.42, 1.76, 1.79, 1.80, 1.98, 1.59};

        /*
        Caso seja necessário obter os dados através de um loop e preencher os arrays.
        for (int i = 0; i < 10; i++){
            System.out.print("Insira a altura: ");
            altura = sc.nextDouble();
            System.out.print("Insira o sexo [M/F]: ");
            sexo = sc.next();

            if (sexo.equalsIgnoreCase("M")){
                op.setTotMas(op.getTotMas()+1);
                alturasM[i] = altura;
                alturasGrupo[i] = altura;
            } else if (sexo.equalsIgnoreCase("F")){
                op.setTotFem(op.getTotFem()+1);
                alturasF[i] = altura;
                alturasGrupo[i] = altura;
            } else{
                System.out.println("Opção inválida");
                System.out.print("Insira o sexo [M/F]: ");
                sexo = sc.next();
            }
        }
        */

        op.retornaMaiorMenorAlt(alturasGrupo);
        System.out.println("Média da altura do sexo masculino: " + op.calculaMedia(alturasM));
        System.out.println("Total de registros do sexo feminino: " + op.contaFeminino(alturasF));
    }
}
