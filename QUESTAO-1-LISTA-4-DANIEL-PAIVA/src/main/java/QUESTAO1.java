// import static org.junit.jupiter.api.Assertions.assertEquals;

// import org.junit.jupiter.api.Test;

// Faça um programa que peça uma nota, entre zero e dez. Mostre uma
// mensagem caso o valor seja inválido e continue pedindo até que o usuário
// informe um valor válido

import java.util.Scanner;

public class QUESTAO1 {
  public static void main(String[] args) {

    Scanner enterScanner = new Scanner(System.in);
    
    int nota;
    
    do {
    System.out.println("Digite uma nota entre 0 e 10: ");
    nota = enterScanner.nextInt();

    if (nota < 0 || nota > 10){
      
      System.out.println("Nota inválida. Digite uma nota entre 0 e 10: ");
      }
   }while (nota < 0 || nota > 10); {
      
      System.out.println("Nota válida, sua nota foi " + nota);
    }
    enterScanner.close();

  }



}

  // @Test
  // void addition() {
  //     assertEquals(2, 1 + 1);
  // }
