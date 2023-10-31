package lista02;

import java.util.Scanner;

public class Program {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o primeiro termo:");
        int primeiroTermo = scan.nextInt();
        System.out.println("Digite a razão:");
        int razao = scan.nextInt();
        System.out.println("Quantos termos mostrar?");
        int n = scan.nextInt();

        ProgressaoAritmetica pa = new ProgressaoAritmetica(razao, primeiroTermo);

        System.out.println(pa.getPrimeiroTermo());
        for(int i = 0; i<n; i++){
            System.out.println(pa.proximoTermo());
        }

        pa.setRazao(4);
        pa.setPrimeiroTermo(1);

        for(int i = 0; i<n; i++){
            System.out.println(pa.proximoTermo());
        }
    }
}
