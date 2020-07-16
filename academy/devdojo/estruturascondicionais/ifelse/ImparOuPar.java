package academy.devdojo.estruturascondicionais.ifelse;
/*
Dado um determinado número inteiro
Imprima se ele é impar ou par
Resto da divisão por 2 se for par sempre vai ser 0
Senão vai ser impar
 */

public class ImparOuPar {
    public static void main(String[] args) {
        int numero = 3;
        if( (numero % 2) == 0) {
            System.out.println("PAR: "+(numero % 2));
        } else {
            System.out.println("IMPAR: "+(numero % 2));
        }
    }
}