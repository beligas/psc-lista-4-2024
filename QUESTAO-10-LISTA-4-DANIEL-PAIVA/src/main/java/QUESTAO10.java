// import static org.junit.jupiter.api.Assertions.assertEquals;

// import org.junit.jupiter.api.Test;
// Faça um programa que receba dois números inteiros e gere os números
// inteiros que estão no intervalo compreendido por eles.

import java.util.Scanner;
import java.util.Random;

public class QUESTAO10 {
  public static void main(String[] args) {

    Scanner enterScanner = new Scanner(System.in);
    Random random = new Random();

    int num1;
    int num2;
    int maior;
    int menor;
    int Sorteio;

    System.out.println("Informe dois numero inteiros");
    num1 =enterScanner.nextInt();
    num2 =enterScanner.nextInt();
   
   
    maior =Math.max(num1, num2);
    menor =Math.min(num1, num2);

    Sorteio = random.nextInt(maior - menor + 1) + menor;

    System.out.println("O numero sorteado foi: " + Sorteio);
    
    enterScanner.close();
  }

  // @Test
  // void addition() {
  //     assertEquals(2, 1 + 1);
  // }
}