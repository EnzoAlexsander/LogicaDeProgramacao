package academy.devdojo.estruturascondicionais.swithcase;
/*
Como gerente eu gostaria que meus usuários pudessem digitar o tipo de conta e o sistema
imprima qual a porcentagem de juros que aquela conta irá oferecer com o intuito de agilizar
 o acesso as informações
Os tipos de conta são:
CONTA_POUPANCA 0.05%
CONTA_CORRENTE 0,02%
CONTA_INVESTIMENTO 0,1%
 */

public class TipoDeConta {
    public static void main(String[] args) {
        String conta = "CONTA_CORRENTE";
        switch (conta) {
            case "CONTA_POUPANCA":
                System.out.println("0,05%");
                break;
            case "CONTA_CORRENTE":
                System.out.println("0,02%");
                break;
            case "CONTA_INVESTIMENTO":
                System.out.println("0,1%");
                break;
            default:
                System.out.println("CONTA INEXISTENTE");
        }
    }
}
