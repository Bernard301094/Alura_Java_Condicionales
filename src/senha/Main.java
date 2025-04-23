package senha;

import java.util.Scanner;

public class Main {
    private String senhaPadrao = "123456";

    void validarSenha() {
        Scanner scanner = new Scanner(System.in);
        String senhaInserida = "";

        while (!senhaInserida.equals(senhaPadrao)) {
            System.out.println("Digite a senha: ");
            senhaInserida = scanner.nextLine();

            if (senhaInserida.equals(senhaPadrao)) {
                System.out.println("Acesso permitido!");
            } else {
                System.out.println("Acesso negado!");
            }
        }

        scanner.close();
    }

    public static void main(String[] args) {
        Main pedirSenha = new Main();
        pedirSenha.validarSenha();
    }
}