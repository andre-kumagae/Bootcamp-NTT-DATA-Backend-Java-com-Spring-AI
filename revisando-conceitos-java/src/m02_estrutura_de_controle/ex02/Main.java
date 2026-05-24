package m02_estrutura_de_controle.ex02;

import java.util.Scanner;

/**
 * 2. Escreva um código onde o usuário entra com sua altura e peso, seja feito o calculo do seu IMC(IMC = peso/(altura * altura)) e seja exibida a mensagem de acordo com o resultado:
 * - Se for menor ou igual a 18,5 "Abaixo do peso";
 * - se for entre 18,6 e 24,9 "Peso ideal";
 * - Se for entre 25,0 e 29,9 "Levemente acima do peso";
 * - Se for entre 30,0 e 34,9 "Obesidade Grau I";
 * - Se for entre 35,0 e 39,9 "Obesidade Grau II (Severa)";
 * - Se for maior ou igual a 40,0 "Obesidade III (Mórbida)";
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe o seu peso: ");
        double peso = scanner.nextDouble();
        System.out.print("Informe a sua altura: ");
        double altura = scanner.nextDouble();
        double imc = peso / (altura * altura);
        String resultadoImc = (imc >= 40) ? "Obesidade III (Mórbida)" :
                (imc >= 35) ? "Obesidade Grau II (Severa)" :
                (imc >= 30) ? "Obesidade Grau I" :
                (imc >= 25) ? "Levemente acima do peso" :
                (imc >= 25) ? "Peso ideal" :
                "Abaixo do peso";
        System.out.printf("Você possui o IMC de %.2f e está no nível: %s.", imc, resultadoImc);
        if (imc >= 24.9) {
            double pesoIdeal = (24.9 * peso) / imc;
            double perdaDePeso = peso - pesoIdeal;
            System.out.printf("\nPara chegar no peso ideal, você deve perder %.2f kg para chegar nos %.2f kg.", perdaDePeso, pesoIdeal);
        }
    }
}
