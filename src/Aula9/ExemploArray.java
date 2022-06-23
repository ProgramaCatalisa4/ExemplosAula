package Aula9;

import java.util.Scanner;

public class ExemploArray {
    public static void main(String[] args) {
        //Quando já sei os valores que preciso usar
        int[] idades = {10, 20, 30};
        System.out.println(idades[0]);
        System.out.println(idades[1]);
        System.out.println(idades[2]);

        //O número dentro do colchete abaixo é o tamanho que o array deve reservar em memória
        int[] codigos = new int[50];
        boolean[] tabelaVerdade = new boolean[100];

        Scanner input = new Scanner(System.in);
        double[] notas = new double[4];
        System.out.print("Digite a nota 1: ");
        notas[0] = input.nextDouble();
        System.out.print("Digite a nota 2: ");
        notas[1] = input.nextDouble();
        System.out.print("Digite a nota 3: ");
        notas[2] = input.nextDouble();
        System.out.print("Digite a nota 4: ");
        notas[3] = input.nextDouble();
        double media = (notas[0] + notas[1] + notas[2] + notas[3]) / 4;

        System.out.println("A média é: " + media);

        //Quando não sei os valores que serão inseridos
        String[] nomes = new String[11];
        nomes[0] = "Joyce";
        nomes[1] = "Victor";
        nomes[2] = "William";
        nomes[3] = "Ana";
        nomes[4] = "Saulo";
        nomes[5] = "Maurício";
        nomes[6] = "Paulo";
        nomes[7] = "Davi";
        nomes[8] = "Eve";
        nomes[9] = "Persidh";
        System.out.println(nomes[9]);
        System.out.println(nomes[10]);
    }

}
