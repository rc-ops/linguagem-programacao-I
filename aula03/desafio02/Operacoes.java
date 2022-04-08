package com.aulasjava.universidade.aula03.desafio02;

public class Operacoes {
    public static void calculoMedia(double nota1, double nota2){
        double media = (nota1+nota2)/2;
        Inicio.aluno.setMedia(media);
        mudaSituacao(media);
    }

    private static void mudaSituacao(double media){
        if (media >= 7){
            Inicio.aluno.setSituacao("APROVADO");
        } else if (media >= 5 && media <= 6.9){
            Inicio.aluno.setSituacao("PROVA FINAL");
            quantoFalta(1, media);
        } else if (media >= 0 && media <= 4.9){
            Inicio.aluno.setSituacao("RECUPERAÇÃO");
            quantoFalta(2, media);
        }
    }

    private static void quantoFalta(int Situacao, double media){
        /* Situações
        1 - Prova final
        2 - Recuperação
         */
        switch(Situacao){
            case 1 -> System.out.println("Nota necessária para passar: " + (10-media));
            case 2 -> System.out.println("Nota necessária para passar: " + (10-media+2));
        }
    }
}
