package inteiros;

import java.util.Scanner;

public class Main {

    void compararInteiros() {
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Digite o primeiro número:");
        int num1 = scanner1.nextInt();

        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Digite o segundo número:");
        int num2 = scanner2.nextInt();

        if(num1 > num2 || num2 > num1 ) {
            if (num1 > num2) {
                System.out.println("O maior número é " + num1);
            } else {
                System.out.println("O maior número é " + num2);
            }
        } else {
            System.out.println("Ambos números são iguais");
        }
    }

    public static void main(String[] args) {
        Main main = new Main();
        main.compararInteiros();
    }
}
