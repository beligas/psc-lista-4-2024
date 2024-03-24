// import static org.junit.jupiter.api.Assertions.assertEquals;

// import org.junit.jupiter.api.Test;

// Faça um programa que leia 5 números e informe a soma e a média dos
// números.

import java.util.Scanner;

public class QUESTAO8 {
  public static void main(String[] args) {

    Scanner enterScanner = new Scanner(System.in);
    
    double num1;
    double num2;
    double num3;
    double num4;
    double num5;
    double soma;
    double media;
    
    System.out.println("Informe 5 numeros");
    num1 = enterScanner.nextDouble();
    num2 = enterScanner.nextDouble();
    num3 = enterScanner.nextDouble();
    num4 = enterScanner.nextDouble();
    num5 = enterScanner.nextDouble();

    soma = num1 + num2 + num3 + num4 + num5;
    media = soma / 5;

    System.out.println("A soma dos numeros é: " + soma);
    System.out.println("A media dos numeros é: " + media);
  }

  // @Test
  // void addition() {
  //     assertEquals(2, 1 + 1);
  // }
}