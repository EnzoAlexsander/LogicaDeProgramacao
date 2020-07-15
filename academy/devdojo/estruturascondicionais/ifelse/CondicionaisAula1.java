package academy.devdojo.estruturascondicionais.ifelse;

/*
if = true ou false.
Obs: O if só sera compilado se a condição for verdadeira.
O Else será compilado sempre que o if não for compilado
 */
public class CondicionaisAula1 {
    public static void main(String[] args) {
        boolean condicao = false;
        if(condicao) {
            System.out.println("Dentro do IF");
        } else{
            System.out.println("Dentro do ELSE");
        }
        System.out.println("Fora do IF");
    }
}
