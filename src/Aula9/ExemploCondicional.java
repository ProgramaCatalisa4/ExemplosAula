package Aula9;

import java.util.Scanner;

public class ExemploCondicional {
    public static void main(String[] args) {
        /*
         * Se a média for menor ou igual a 6, está reprovado
         * Se a média for menor ou igual a 8, está aprovado
         * Se a média for maior que 8 está aprovado com louvor
         * */
        double media = 6;
        if (media <= 6) {
            System.out.println("Você está reprovado");
        } else if ((media > 6) && (media <= 8)) {
            System.out.println("Você está aprovado");
        } else {
            System.out.println("Você está aprovado com louvor");
        }

        Scanner input = new Scanner(System.in);
        System.out.print("Digite (s)sim ou (n)não: ");
        String opcao = input.next();
        input.close();

        if (opcao.equalsIgnoreCase("n")) {
            System.out.println("Sua opção foi não");
        } else if (opcao.equalsIgnoreCase("s")) {
            System.out.println("Sua opção foi sim");
        } else {
            System.out.println("Opção inválida, tente novamente");
        }

        Scanner input2 = new Scanner(System.in);
        System.out.print("Digite a opção desejada (1 ou 2): ");
        int opcao2 = input2.nextInt();
        input2.close();

        if (opcao2 == 1) {
            System.out.println("Sua opção foi número 1");
        } else if (opcao2 == 2) {
            System.out.println("Sua opção foi número 2");
        } else {
            System.out.println("Opção inválida, tente novamente");
        }

        switch (opcao2) {
            case 1:
                System.out.println("Sua opção escolhida foi o número 1");
                break;
            case 2:
                System.out.println("Sua opção escolhida foi o número 2");
                break;
            default:
                System.out.println("Opção inválida, tente novamente");
        }

        String diaDaSemana = "Segunda";

        switch (diaDaSemana) {
            case "Segunda":
                System.out.println("Hoje é segunda");
                break;
            case "Terça":
                System.out.println("Hoje é terça");
                break;
            default:
                System.out.println("Não sei que dia é hoje");
        }
    }
}
