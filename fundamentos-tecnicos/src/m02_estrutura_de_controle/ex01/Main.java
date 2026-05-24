package m02_estrutura_de_controle.ex01;

import java.util.Scanner;

/**
 * Escreva um código onde o usuário entra com um número e seja gerada a tabuada de 1 até 10 desse número;
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe o multiplicando para o cálculo de sua tabuada: ");
        int multiplicando = scanner.nextInt();
        for (int i = 1; i < 11; i++) {
            System.out.printf("%d x %d = %d%n", multiplicando, i, multiplicando * i);
        }
    }
}
