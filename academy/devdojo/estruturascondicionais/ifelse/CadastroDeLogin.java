package academy.devdojo.estruturascondicionais.ifelse;
/*
Eu como admnistrador do sistema gostaria de permitir que os
próprios usuários cadastrassem o nome do usuário (Login) no
sistema para agilizar o processo de migração do sistema
antigo para o novo.
O usuário não pode deixar o Login vazio "", ou criar um usuário
com o login "admin" ou "administrador".
Se o valor entrado for válido, o sistema deverá exibir uma
mensagem "<nome do usuário> cadastrado com sucesso"
Senão o sistema deverá mostrar o erro "Usuário inválido".
 */
import java.util.Scanner;

public class CadastroDeLogin {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o seu nome: ");
        String nome=input.next();
        if (nome.equals("") || nome.equalsIgnoreCase("admin") || nome.equalsIgnoreCase("administrador")) {
            System.out.println("Usuário inválido");
        }else {
            System.out.println(nome + " cadastrado com sucesso");
        }
    }
}
