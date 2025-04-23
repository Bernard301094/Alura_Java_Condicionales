/*
João está desenvolvendo um sistema de segurança para uma empresa. Para acessar o sistema, o usuário precisa fornecer:

Um código de acesso numérico (o código correto é 2023).

Um nível de permissão numérico (os níveis válidos são 1, 2 ou 3).

O sistema só permitirá o acesso se:

O código de acesso estiver correto.

O nível de permissão for válido (1, 2 ou 3).

Caso contrário, o acesso será negado, e o programa deve informar o motivo (código incorreto, nível de permissão inválido ou ambos).

Crie um programa que receba o código de acesso e o nível de permissão e exiba uma mensagem indicando se o acesso foi permitido ou negado, além do motivo, se for o caso.

    Exemplo de entrada:
    Digite o código de acesso: 2023
    Digite o nível de permissão: 2

    Saída esperada:
    Acesso permitido. Bem-vindo ao sistema!

 */

package acceso.verificacao;

import java.util.Scanner;

public class Main {
    int codigoAcesso = 2023;
    int nivelPermissao1 = 1;
    int nivelPermissao2 = 2;
    int nivelPermissao3 = 3;

    void verificarAcesso(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o código de acesso: ");
        int codigo = scanner.nextInt();

        System.out.print("Digite o nível de permissão: ");
        int nivelPermissao = scanner.nextInt();

        if(codigo == codigoAcesso && (nivelPermissao == nivelPermissao1 || nivelPermissao == nivelPermissao2 || nivelPermissao == nivelPermissao3)) {
            System.out.println("Acesso permitido. Bem-vindo ao sistema!");
        } else {
            if(codigo != codigoAcesso && (nivelPermissao != nivelPermissao1 && nivelPermissao != nivelPermissao2 && nivelPermissao != nivelPermissao3)) {
                System.out.println("Acesso negado. Código de acesso incorreto e nível de permissão inválido.");
            } else if(codigo != codigoAcesso) {
                System.out.println("Acesso negado. Código de acesso incorreto.");
            } else {
                System.out.println("Acesso negado. Nível de permissão inválido.");
            }
        }
        scanner.close();
    }

    public static void main(String[] args) {
        Main main = new Main();
        main.verificarAcesso();
    }

}
