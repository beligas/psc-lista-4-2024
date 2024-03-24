// import static org.junit.jupiter.api.Assertions.assertEquals;

// import org.junit.jupiter.api.Test;

// Faça um programa que leia um nome de usuário e a sua senha e não aceite a
// senha igual ao nome do usuário, mostrando uma mensagem de erro e
// voltando a pedir as informações.

import java.util.Scanner;

public class QUESTAO2 {
    public static void main(String[] args) {
        Scanner enterScanner = new Scanner(System.in);

        String usuario;
        String senha;

        do {
            System.out.println("Informe seu usuário:");
            usuario = enterScanner.nextLine();

            System.out.println("Informe a sua senha:");
            senha = enterScanner.nextLine();

            if (usuario.equals(senha)) {
                System.out.println("O usuário e a senha não podem ser iguais.");
            } else {
                System.out.println("Seja bem-vindo!");
            }
        } while (usuario.equals(senha));
     enterScanner.close();
    }
 }


  // @Test
  // void addition() {
  //     assertEquals(2, 1 + 1);
  // }
