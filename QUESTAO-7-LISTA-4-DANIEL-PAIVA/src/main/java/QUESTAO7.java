// import static org.junit.jupiter.api.Assertions.assertEquals;

// import org.junit.jupiter.api.Test;

// Faça um programa que leia 5 números e informe o maior número.

import java.util.Scanner;

public class QUESTAO7 {
  public static void main(String[] args) {

    Scanner enterScanner = new Scanner(System.in);

    double num1, num2, num3, num4, num5;
    double maior;
   
    System.out.println("Informe 5 numero");
    num1 = enterScanner.nextDouble();
    num2 = enterScanner.nextDouble();
    num3 = enterScanner.nextDouble();
    num4 = enterScanner.nextDouble();
    num5 = enterScanner.nextDouble();

    maior = Math.max(num1, Math.max(num2, Math.max(num3, Math.max(num4, num5))));

    System.out.println("O maior numero entre eles é o " + maior);
    
    enterScanner.close();

  }
  // @Test
  // void addition() {
  //     assertEquals(2, 1 + 1);
  // }
}