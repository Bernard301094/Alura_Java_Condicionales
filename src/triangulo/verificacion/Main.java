/*

Marcos está estudando geometria e precisa verificar se três lados podem formar um triângulo. Para que três lados formem um triângulo, a soma de dois lados deve ser maior que o terceiro lado. Ele quer um programa que receba três lados e exiba uma mensagem informando se os lados podem formar um triângulo ou não.

Com base nesse cenário, crie um programa que receba três lados e exiba uma mensagem informando se os lados podem formar um triângulo ou não.

    Exemplo de entrada:

    Digite o primeiro lado: 3
    Digite o segundo lado: 4
    Digite o terceiro lado: 5

    Saída esperada:
    Os lados podem formar um triângulo.

*/

package triangulo.verificacion;

import java.util.Scanner;

public class Main {

    // Método para verificar se três lados podem formar um triângulo
    void verificarTriangulo() {

        Scanner scanner = new Scanner(System.in);

        // Solicita o primeiro lado ao usuário
        System.out.print("Digite o primeiro lado: ");
        int lado1 = scanner.nextInt();

        // Solicita o segundo lado ao usuário
        System.out.print("Digite o segundo lado: ");
        int lado2 = scanner.nextInt();

        // Solicita o terceiro lado ao usuário
        System.out.print("Digite o terceiro lado: ");
        int lado3 = scanner.nextInt();

        // Verifica se os lados podem formar um triângulo usando a condição da soma dos lados
        if (lado1 + lado2 > lado3 && lado1 + lado3 > lado2 && lado2 + lado3 > lado1) {
            System.out.println("Os lados podem formar um triângulo.");
        } else {
            System.out.println("Os lados não podem formar um triângulo.");
        }
        scanner.close();
    }

    //Método principal para executar o programa

    public static void main(String[] args) {
        Main triangulo = new Main();

        triangulo.verificarTriangulo();
    }
}
