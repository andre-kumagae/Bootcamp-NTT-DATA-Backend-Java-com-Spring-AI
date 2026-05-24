package m01_fundamentos_java.ex02;

import java.util.Scanner;

/**
 * 2. Escreva um código que receba o tamanho do lado de um quadrado, calcule sua área e exiba na tela. fórmula: área=lado X lado
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe um lado do quadrado: ");
        double lado = scanner.nextDouble();
        System.out.printf("Um quadrado de lado %.2f possui a área %.2f", lado, lado * lado);
    }
}
