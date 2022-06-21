package Aula7;

public class Exemplos {
    public static void main(String[] args) {
        //Exemplo de boolean primitivo
        boolean isChovendo = true;
        String nomeCompleto = "Carolina";
        String testeBoolean = "true";

        System.out.println("A variável isChovendo é: " + isChovendo);
        System.out.println("A variável nomeCompleto contém o nome: " + nomeCompleto);
        System.out.println("A variável testeBoolean contém o texto: " + testeBoolean);
        /*
         * Teste de que a variável testeBoolean realmente é do tipo String
         * */
        System.out.println(testeBoolean instanceof String);

        //Exemplo de Boolean (tipo Wrapper)
        Boolean isEnsolarado = true;

        //Exemplo primitivos - numerais
        byte numero1 = 127;
        short numero2 = 32767;
        int numero3 = 2147483647;
        long numero4 = 9000000000000000000L;

        /*Exemplo wrapper - numerais*/
        Byte numero6 = 127;
        Short numero7 = 32767;
        Integer numero8 = 2147483647;
        Long numero9 = 9000000000000000000L;

        //Exemplo primitivos - decimais
        double decimal1 = 10.0;
        float decimal2 = 10.0f;

        /*Exemplo wrapper - decimais*/
        Double decimal3 = 10.0;
        Float decimal4 = 10.0f;
    }

}
