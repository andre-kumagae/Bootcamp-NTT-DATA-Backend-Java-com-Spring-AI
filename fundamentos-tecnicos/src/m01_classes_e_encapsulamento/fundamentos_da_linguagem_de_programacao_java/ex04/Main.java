package m01_classes_e_encapsulamento.fundamentos_da_linguagem_de_programacao_java.ex04;

import java.util.Scanner;

/**
 * 4. Escreva um código que receba o nome e a idade de 2 pessoas e imprima a diferença de idade entre elas
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe a idade da 1ª pessoa: ");
        int idade1 = scanner.nextInt();
        System.out.print("Informe a idade da 2ª pessoa: ");
        int idade2 = scanner.nextInt();
        int diferencaIdades = (idade1 > idade2) ? (idade1 - idade2) : (idade2 - idade1);
        System.out.printf("A diferença das idades entre %d e %d é %d.",idade1,idade2,diferencaIdades);
    }
}
