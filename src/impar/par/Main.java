/*
Ana precisa identificar se um número é par ou ímpar para um jogo que está desenvolvendo. Para isso, deseja criar um programa que analisa se o número que ela definiu previamente é par ou ímpar.

Como você ajudaria Ana a escrever um programa que determine se um número é par ou ímpar e exiba o resultado corretamente?

Saída esperada:
    O número 8 é par.

    Ou

    O número 7 é ímpar.
 */

package impar.par;

import java.util.Scanner;

public class Main {

    void verificarParImpar() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int numero = scanner.nextInt();

        if(numero % 2 == 0) {
            System.out.println("O número " + numero + " é par.");
        } else {
            System.out.println("O número " + numero + " é ímpar.");
        }
        scanner.close();
    }

    public static void main(String[] args) {
        Main parImpar = new Main();
        parImpar.verificarParImpar();
    }
}
