package Aula9;

public class ExemploArrayDuasDim {
    public static void main(String[] args) {
        //Quando eu preciso criar uma matriz e SEI os valores que serão inseridos
        int[][] idadesEAnoNascimento = {{10, 20, 30}, {2012, 2002, 1992}};
        //Primeiro a coluna e depois a linha
        System.out.println(idadesEAnoNascimento[0][0]);
        System.out.println(idadesEAnoNascimento[1][0]);

        //Quando eu preciso criar uma matriz e NÃO sei os valores que serão inseridos
        String[][] nomesESobrenomes = new String[10][10];
    }
}
