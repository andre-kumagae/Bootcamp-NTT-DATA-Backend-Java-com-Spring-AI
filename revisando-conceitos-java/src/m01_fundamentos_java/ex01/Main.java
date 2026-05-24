package m01_fundamentos_java.ex01;

import java.util.Scanner;

/**
 * 1. Escreva um código que receba o nome e o ano de nascimento de alguém e imprima na tela a seguinte mensagem: "Olá 'Fulano' você tem 'X' anos"
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o seu nome: ");
        String nome = scanner.nextLine();
        System.out.print("Digite o seu ano de nascimento: ");
        Integer anoDeNascimento = scanner.nextInt();
        int anoAtual = java.time.LocalDateTime.now().getYear();
        int idade = anoAtual - anoDeNascimento;
        System.out.printf("Olá,\'%s\'! Você tem %d anos.",nome,idade);
    }
}
