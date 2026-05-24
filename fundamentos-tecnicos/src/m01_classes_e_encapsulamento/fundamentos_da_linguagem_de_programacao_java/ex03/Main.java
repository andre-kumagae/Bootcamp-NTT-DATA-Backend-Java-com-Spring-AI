package m01_classes_e_encapsulamento.fundamentos_da_linguagem_de_programacao_java.ex03;

import java.util.Scanner;

/**
 * 3. Escreva um código que receba a base e a alturade um retângulo, calcule sua área e exiba na tela - fórmula: área=base X altura
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe a base do retângulo: ");
        double base = scanner.nextDouble();
        System.out.print("Informe um lado do retângulo: ");
        double lado = scanner.nextDouble();
        System.out.printf("Um retângulo de lado %.2f e base %.2f possui a área %.2f", lado, base, base * lado);
    }
}
