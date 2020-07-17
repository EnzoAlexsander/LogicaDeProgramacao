package academy.devdojo.estruturascondicionais.ifelse;
/*
Problema
Eu como usuario gostaria de ter o nome e a idade de
participantes de um torneio de natação e que o sistema
imprimisse da seguinte forma:
Menor que 10 anos: <Nome> participará da categoria Infantil
Entre 11 e 15 anos: <Nome> participará da categoria Juvenil
Entre 16 e 19 anos: <Nome> participará da categoria Pré-adulto
Acima de 28 anos: <Nome> participará da categoria Adulto
Para que eu possa rapidamente classificar todos os participantes

Estudar os temas abaixo:
Processos de desenvolvimento de software
Metodologias Ágeis
SCRUM
 */

public class TorneioDeNatacao {
    public static void main(String[] args) {
        String nome = "Luffy";
        int idade = 10;
        if(idade < 11) {
            System.out.println(nome +"participará da categoria Infantil");
        }else if (idade >= 11 && idade < 16) {
            System.out.println(nome + "participará da categoria Juvenil");
        }else if (idade >= 16 && idade <= 19){
            System.out.println(nome + "participará da categoria Préadulto");
        }else{
            System.out.println(nome + "participará da categoria Adulto");
        }
    }

}
