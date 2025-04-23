/*
Emerson trabalha em um banco e precisa verificar se um número digitado pelo cliente está dentro da faixa permitida de valores para um empréstimo, que vai de 1000 a 5000 reais.

Crie um programa que receba um valor e exiba se ele está dentro do intervalo permitido ou não.

    Exemplo de entrada:

    Digite o valor do empréstimo: 750

    Saída esperada:
    O valor 750, não está dentro do intervalo permitido para empréstimo.
*/

package intervalo.numero;

import java.util.Scanner;

public class Main {
    double valorMinimo = 1000;
    double valorMaximo = 5000;

    void calcularEmprestimo(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o valor do empréstimo: ");
        double valorEmprestimo = scanner.nextDouble();

        if(valorEmprestimo >= valorMinimo && valorEmprestimo <= valorMaximo){
            System.out.println("O valor " + valorEmprestimo + ", está dentro do intervalo permitido para empréstimo.");
        } else {
            System.out.println("O valor " + valorEmprestimo + ", não está dentro do intervalo permitido para empréstimo.");
        }
        scanner.close();
    }

    public static void main(String[] args) {
        Main emprestimo = new Main();
        emprestimo.calcularEmprestimo();
    }
}
