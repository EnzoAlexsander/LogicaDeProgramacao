package academy.devdojo.estruturascondicionais.ifelse;
/*
Receba uma idade como entrada
Se idade for maior que 18, imprima "Adulto"
Senão, imprima "Ainda Não é Adulto"
 */
/*
Operadores em condicionais

== -> Igualdade
!= -> Diferente
<  -> Menor que
>  -> Maior que
<= -> Menor ou igual a
>= -> Maior ou igual a
 */

public class VerificaIdade {
    public static void main(String[] args) {

        int idade = 19;
        if(idade > 18) {
            System.out.println("Adulto");
        } else {
            System.out.println("Ainda não é Adulto");
        }
    }
}
