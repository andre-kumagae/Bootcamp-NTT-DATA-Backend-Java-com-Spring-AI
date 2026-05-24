package m02_estrutura_de_controle.ex03;

import java.util.Scanner;

/**
 * 3. Escreva um código que o usuário entre com um primeiro número, um segundo número maior que o primeiro e escolhe entre a opção par e impar, com isso o código deve informar todos os números pares ou ímpares (de acordo com a seleção inicial) no intervalo de números informados, incluindo os números informados e em ordem decrescente;
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Número 1: ");
        int numero1 = scanner.nextInt();
        System.out.print("Número 2: ");
        int numero2 = scanner.nextInt();
        System.out.print("Digite 1 para ímpar ou 2 para par: ");
        int parOuImpar = scanner.nextInt();
        if (parOuImpar == 1) {
            if (numero2 % 2 == 0) {
                numero2 -= 1;
            }
        } else {
            if (numero2 % 2 != 0) {
                numero2 -= 1;
            }
        }
        for (int i = numero2; i >= numero1; i -= 2) {
            System.out.print(i + " ");
        }
    }
}
