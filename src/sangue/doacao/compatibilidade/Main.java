/*

Maria trabalha em um banco de sangue e precisa verificar se um doador é compatível para doar sangue. Para ser compatível, o doador deve atender aos seguintes critérios:

Ter entre 18 e 65 anos.

Pesar mais de 50 kg.

Ela deseja um programa que receba a idade e o peso do doador e informe se ele é compatível para doar sangue. Se não for, o programa deve indicar qual critério não foi atendido.

Como você criaria um programa que receba a idade e o peso do doador e exiba uma mensagem indicando se ele é compatível ou não, além de informar o critério não atendido, se for o caso?

    Exemplo de entrada:
    Digite a idade do doador: 17
    Digite o peso do doador (em kg): 55

    Saída esperada:
    O doador não é compatível.
    Motivo: Deve ter entre 18 e 65 anos.
 */

package sangue.doacao.compatibilidade;

import java.util.Scanner;

public class Main {
    int idadeMinima = 18;
    int idadeMaxima = 65;
    int pesoMinimo = 50;

    void verificaCompatibilidade() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a idade do doador: ");
        int idade = scanner.nextInt();

        System.out.print("Digite o peso do doador (em kg): ");
        int peso = scanner.nextInt();

        if(idade <= idadeMaxima && idade >= idadeMinima && peso > pesoMinimo) {
            System.out.println("O doador é compatível.");
        } else {
            System.out.println("O doador não é compatível.");
            if(idade < idadeMinima || idade > idadeMaxima) {
                System.out.println("Motivo: Deve ter entre " + idadeMinima + " e " + idadeMaxima + " anos.");
            }
            if(peso <= pesoMinimo) {
                System.out.println("Motivo: Deve pesar mais de " + pesoMinimo + " kg.");
            }
        }

        scanner.close();
    }

    public static void main(String[] args) {
        Main compatibilidade = new Main();
        compatibilidade.verificaCompatibilidade();
    }
}
