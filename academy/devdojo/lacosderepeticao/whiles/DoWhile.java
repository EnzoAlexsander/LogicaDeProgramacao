package academy.devdojo.lacosderepeticao.whiles;

import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {
        int desejaContinuar = 1;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Player 1: Digite um numero de 1 a 10");
            int num1 = scanner.nextInt();
            System.out.println("Player 2: Digite um numero de 1 a 10");
            int num2 = scanner.nextInt();
            System.out.println("Resultado: "+(num1 == num2));
            System.out.println("-----------------------------------------");
            System.out.println("Deseja Continuar Jogando?");
            System.out.println("1.Sim");
            System.out.println("2.Não");
            desejaContinuar = scanner.nextInt();
        } while(desejaContinuar == 1);
        System.out.println("Fim de jogo");
    }
}