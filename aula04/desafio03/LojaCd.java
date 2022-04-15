package com.aulasjava.universidade.aula04.desafio03;
import com.bethecoder.ascii_table.ASCIITable;

import java.util.Scanner;

public class LojaCd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Cores disponíveis: Verde, Azul, Amarelo e Vermelho");
        System.out.print("Insira o nome da cor ou digite 'preço' para ver a tabela com os preços: ");
        String cor = sc.nextLine();
        if (cor.equalsIgnoreCase("verde")) {
            System.out.println("Preço da cor verde: R$ 10,00");
        } else if (cor.equalsIgnoreCase("azul")) {
            System.out.println("Preço da cor azul: R$ 20,00");
        } else if (cor.equalsIgnoreCase("amarelo")) {
            System.out.println("Preço da cor amarela: R$ 30,00");
        } else if (cor.equalsIgnoreCase("vermelho")) {
            System.out.println("Preço da cor vermelha: R$ 40,00");
        } else if (cor.equalsIgnoreCase("preço")) {
            mostraTabela();
        }
}

    private static void mostraTabela(){
        String[] tableHeaders = {"COR", "PREÇO"};
        String[][] tableData = {
                {"Verde", "10,00"},
                {"Azul", "20,00"},
                {"Amarelo", "30,00"},
                {"Vermelho", "40,00"},
        };
        ASCIITable.getInstance().printTable(tableHeaders, tableData);
    }
}
