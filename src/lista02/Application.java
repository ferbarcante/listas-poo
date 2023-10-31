package lista02;

import java.util.Scanner;

public class Application {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        int resposta;

        Conta conta = new Conta();
        conta.setNumeroDaConta(122321);
        conta.setSaldo(1500);
        conta.setNomeDoCorretista("Maria");

        do {

            System.out.println("--------------------------");
            System.out.println("   (1) - SAQUE ");
            System.out.println("   (2) - DEPOSITO");
            System.out.println("   (3) - CONSULTAR SALDO ");
            System.out.println("   (0) - SAIR ");
            System.out.println("--------------------------");

            resposta = scan.nextInt();

            if(resposta==1){
                System.out.println("Digite o valor do saque:");
                double saque = scan.nextDouble();
                conta.saque(saque);
            } else if (resposta==2){
                System.out.println("Digite o valor a ser depositado: ");
                double valorDeposito = scan.nextDouble();
                conta.deposito(valorDeposito);
            }else if(resposta==3){
                System.out.println(conta.getSaldo());
            }

        } while (resposta != 0);
    }
}
