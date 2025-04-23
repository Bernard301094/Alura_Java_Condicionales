/*
Marcos trabalha em uma loja e precisa verificar se um cliente tem direito a um desconto de 10% em sua compra. O desconto é aplicado apenas se o valor da compra for maior ou igual a R$ 100,00. Para isso, ele quer um programa que permita inserir o valor da compra e exiba se o desconto foi aplicado ou não, juntamente com o novo valor após o
desconto, caso aplicável.
Com base nesse cenário, crie um programa que receba o valor da compra e exiba uma mensagem informando se o desconto foi aplicado ou não.

    Exemplo de entrada:
    Digite o valor da compra: 120.0

    Saída esperada:
    Desconto de 10% aplicado.
    Novo valor: R$ 108.0

    Caso o valor da compra seja menor que R$ 100,00, o programa exibirá por exemplo:
    Nenhum desconto aplicado.
    Valor total: R$ 80.0
*/

package compras.desconto;

import java.util.Scanner;

public class Main {
    int desconto = 10;

    void verificarDesconto() {
        double valorCompra;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o valor da compra: ");
        valorCompra = scanner.nextDouble();

        if (valorCompra >= 100) {
            double valorDesconto = valorCompra * desconto / 100;
            System.out.println("Desconto de " + desconto + "% aplicado.");
            System.out.println("Novo valor: R$ " + (valorCompra - valorDesconto));
        }else {
            System.out.println("Nenhum desconto aplicado.");
            System.out.println("Valor total: R$ " + valorCompra);
        }
        scanner.close();
    }

    public static void main(String[] args) {
        Main main = new Main();
        main.verificarDesconto();
    }
}
