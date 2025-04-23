package inteiros;

import java.util.Scanner;

public class Main {

    void compararInteiros() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o primeiro número:");
        int num1 = scanner.nextInt();

        System.out.println("Digite o segundo número:");
        int num2 = scanner.nextInt();

        if(num1 > num2 || num2 > num1 ) {
            if (num1 > num2) {
                System.out.println("O maior número é " + num1);
            } else {
                System.out.println("O maior número é " + num2);
            }
        } else {
            System.out.println("Ambos números são iguais");
        }
        scanner.close();
    }

    public static void main(String[] args) {
        Main main = new Main();
        main.compararInteiros();
    }
}
