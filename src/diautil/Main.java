/*
Carlos trabalha em uma empresa de logística que opera apenas de segunda a sexta, sem atividades nos finais de semana. Para evitar confusões, ele precisa de um programa que, ao receber um dia da semana, informe se é um dia útil ou não.
Crie um programa que receba um dia da semana (em letras minúsculas) e exiba uma mensagem indicando se é um dia útil ou não.

    Exemplo de Entrada:
    Digite o dia da semana (em letras minúsculas): quarta

    Saída esperada:
    Quarta é um dia útil.
*/

package diautil;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    String[] diasUteis = new String[]{"segunda", "terça", "quarta", "quinta", "sexta"};

    void verificarDiaUtil() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o dia da semana (em letras minúsculas): ");
        String dia = scanner.nextLine();

        if (Arrays.asList(diasUteis).contains(dia)) {
            System.out.println(dia + " é um dia útil.");
        } else if (dia.equals("sábado") || dia.equals("domingo")) {
            System.out.println(dia + " não é um dia útil.");
        } else {
            System.out.println("Dia inválido. Por favor, insira um dia da semana válido.");
        }

        scanner.close();
    }

    public static void main(String[] args) {
        Main main = new Main();
        main.verificarDiaUtil();
    }

}
