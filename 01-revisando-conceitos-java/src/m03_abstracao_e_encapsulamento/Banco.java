package m03_abstracao_e_encapsulamento;

import java.util.Scanner;

public class Banco {

    private double saldo;
    private boolean chequeEspecial;
    public double saldoChequeEspecial;


    public static void main(String[] args) {
        menuInicial();
    }


    public Banco(){
        this.saldo = 0;
        this.chequeEspecial = false;
    }


    public static void menuInicial(){
        System.out.println("Escolha uma opção: ");
        System.out.println("""
                1 - Abrir conta
                0 - sair""");
        System.out.print("Opção: ");
        Scanner scanner = new Scanner(System.in);
        int opcao = scanner.nextInt();
        switch(opcao){
            case 1:
                Banco banco = new Banco();
                System.out.println("Informe o valor para depósito");
                System.out.print("Opção: ");
                double valor = scanner.nextDouble();
                banco.saldoChequeEspecial =
                        (valor <= 500) ? 50 : 0.5 * valor;
                banco.chequeEspecial = true;
                banco.depositarDinheiro(valor);
                banco.menuContaCriada(banco, scanner);
                break;
            default:
                System.exit(1);
        }
    }

    public void menuContaCriada(Banco banco, Scanner scanner)
    {
        int opcao = 9;
        do {
            double valor = 0;
            System.out.println("""
   1 - Consultar saldo
   2 - consultar cheque especial
   3 - Depositar dinheiro;
   4 - Sacar dinheiro;
   5 - Pagar um boleto.
   6 - Verificar se a conta está usando cheque especial.
   0 - Encerrar
                """);
            System.out.print("Opção: ");
            opcao = scanner.nextInt();
            switch (opcao){
                case 1:
                    banco.consultarSaldo();
                    break;
                case 2:
                    banco.consultarChequeEspecial();
                    break;
                case 3:
                    valor = informaValor();
                    banco.depositarDinheiro(valor);
                    break;
                case 4:
                    valor = informaValor();
                    banco.sacarDinheiro(valor);
                    break;
                case 5:
                    valor = informaValor();
                    banco.pagarBoleto(valor);
                    break;

                case 6:
                    banco.usandoChequeEspecial();
                    break;
                default:
                    break;
            }
        } while (opcao != 0);
    }

    public double informaValor(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe o valor: ");
        return scanner.nextDouble();
    }

    public void consultarSaldo(){
        if (chequeEspecial){
            System.out.println("Saldo: "+ (saldoChequeEspecial+saldo));
        }
        else{
            System.out.println("Saldo: "+saldo);
        }
    }

    public void consultarChequeEspecial(){
        if (chequeEspecial){
            System.out.println("Saldo do cheque especial: "
                    + saldoChequeEspecial);
        }
    }

    public void depositarDinheiro(double valor){
        saldo += valor;
        System.out.println("Saldo: "+saldo);
    }

    public void sacarDinheiro(double valor){
        saldo -= valor;
        System.out.println("Saldo: "+saldo);

    }

    public void sacarDinheiroChequeEspecial(double valor){
        saldoChequeEspecial -= valor;
        saldo -= (0.2 * valor);
        System.out.println("Saldo: "+saldo);
    }


    public void pagarBoleto(double valor){
        saldo -= valor;
        System.out.println("Saldo: "+saldo);}


    public void usandoChequeEspecial(){
        if (chequeEspecial){
            System.out.println("Usando cheque especial");
        }else{
            System.out.println("Não está usando cheque especial");
        }
    }
}