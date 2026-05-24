package m02_estrutura_de_controle.ex04;

import java.util.Scanner;

/**
 * 4. Escreva um código onde o usuário informa um número inicial, posteriormente irá informar outros N números, a execução do código irá continuar até que o número informado dividido pelo primeiro número tenha resto diferente de  0 na divisão, números menores que o primeiro número devem ser ignorados
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe o dividendo: ");
        int numero1 = scanner.nextInt();
        System.out.print("Informe o divisor: ");
        int numero2 = scanner.nextInt();
        while (numero1 % numero2 == 0) {
            System.out.print("Resto zero. ");
            System.out.print("Informe outro divisor: ");
            numero2 = scanner.nextInt();
        }
        System.out.println("Resto diferente de zero!");
    }
}
