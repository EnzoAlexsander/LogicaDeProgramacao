package academy.devdojo.variaveis;/*Crie um classe que calcule uma determinada porcentagem de um dado salário
Criar uma classe
Aceitar um valor de entrada para o salário
Definir o valor da porcentagem (perguntar quanto?) = 30%
Calcular a porcentagem
 */

public class CalculadoraImposto {
    public static void main (String[] args) {
        float salario = 2500.00F;
        float porcentagem = 30;
        float porcentagemDoSalario = salario * (porcentagem / 100);
        System.out.println(porcentagemDoSalario);
    }
}
