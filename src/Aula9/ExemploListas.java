package Aula9;

import java.util.*;

public class ExemploListas {
    public static void main(String[] args) {
        //ArrayList permite repetição de informação e armazena informação de forma ordenada.
        List<Double> notas = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        System.out.println("Digite a nota 1: ");
        notas.add(input.nextDouble());
        System.out.println("Digite a nota 2: ");
        notas.add(input.nextDouble());
        System.out.println("Digite a nota 3: ");
        notas.add(input.nextDouble());
        System.out.println("Digite a nota 4: ");
        notas.add(input.nextDouble());

        System.out.println(notas.get(0));
        System.out.println(notas.get(1));
        System.out.println(notas.get(2));
        System.out.println(notas.get(3));

        //Se a regra exigir que NÃ0 pode repetir informação na lista, usar o tipo Set
        Set<String> emails = new HashSet<>();
        emails.add("carolina.fonseca@zup.com.br");
        emails.add("joyce.fonseca@zup.com.br");
        emails.add("carolina.fonseca@zup.com.br");
        emails.add("joyce.fonseca@zup.com.br");
        System.out.println("O tamanho da lista do tipo set acima é: " + emails.size());
        String[] array = emails.toArray(new String[emails.size()]);
        System.out.println(array[0]);
        System.out.println(array[1]);
        System.out.println(array[2]);

        Map<String, Double> cardapio = new HashMap<>();
        cardapio.put("Macarronada", 15.00);
        cardapio.put("Bife a rolê", 15.00);
        System.out.println(cardapio.get("Macarronada"));

        Map<String, String> listaConvidades = new HashMap<>();
        listaConvidades.put("carolina.fonseca@zup.com.br", "Carolina Fonseca");
        listaConvidades.put("carolina.nascimento@zup.com.br", "Carolina Fonseca");
        listaConvidades.put("joyce.fonseca@zup.com.br", "Joyce Fonseca");
        System.out.println(listaConvidades.get("carolina.fonseca@zup.com.br"));
        System.out.println(listaConvidades.containsValue("Carolina Fonseca"));
    }
}
