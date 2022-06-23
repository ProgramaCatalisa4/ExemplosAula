package Aula9;

import java.util.Scanner;

public class ExemploLacosRepeticao {
    public static void main(String[] args) {
        int[] idades = {10, 20, 30};
        for (int i = 0; i < idades.length; i++) {
            System.out.println(idades[i]);
            System.out.println("Estou na posição: " + i);
        }

        for (int idade : idades) {
            System.out.println(idade);
        }
        Scanner input = new Scanner(System.in);

        double[] notas = new double[4];
        for (int i = 0; i < notas.length; i++) {
            System.out.println("Digite a nota " + (i + 1));
            notas[i] = input.nextDouble();
        }
        System.out.println("Fim do programa");

        int contador = 1;
        while (contador <= 10) {
            System.out.println(contador + "ª vez: Catalisa 4 é a melhor turma");
            contador++;
        }

        boolean controlador = true;
        int contadorSim = 0;
        while (controlador) {
            System.out.println("Hello world");
            System.out.println("Você deseja continuar rodando? S/N");
            String opcao = input.next();

            if (opcao.equalsIgnoreCase("n")) {
                System.out.println("Fechando programa...");
                System.out.println(contadorSim);
                controlador = false;
            } else {
                contadorSim++;
            }

        }

        boolean controlador2 = false;
        do {
            System.out.println("Catalisa 4 é a melhor turma");
            System.out.println("Deseja rodar mais uma vez? 1 ou 2");
            int opcao = input.nextInt();
            input.close();

            if (opcao == 1) {
                controlador2 = true;
            } else {
                controlador2 = false;
            }

        } while (controlador2);

    }

}
