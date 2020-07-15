package academy.devdojo.estruturascondicionais.ifelse;
/*
Dado um determinado salário
Se o salário for maior que 4500, imprima 30% do valor
Senão, imprima 15% do valor
Desafio1: Utilize apenas uma variavel para guardar o resultado e imprimir no final
Desafio2: Diga na impressão se é 30% ou 15%
 */

public class CalculadoraImpostoComCondicional {
    public static void main(String[] args) {
        float salario = 5000;
        float resultado = 0F;
        String porcentagem = "";

        if(salario > 4500 ) {
            resultado = salario * 0.30F;
            porcentagem = "30%";
        } else {
            resultado = salario * 0.15F;
            porcentagem = "15%";
        }
        System.out.println("O Valor final em porcentagem de "+porcentagem+" é "+resultado);
    }
}
