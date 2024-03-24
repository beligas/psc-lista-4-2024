// import static org.junit.jupiter.api.Assertions.assertEquals;

// import org.junit.jupiter.api.Test;

// Faça um programa que imprima na tela apenas os números ímpares entre 1 e
// 50.
  

public class QUESTAO9 {
  public static void main(String[] args) {

    System.out.println("Os numero impares entre 1 e 50 sao:");
    for (int i = 1; i <= 50; i++){
      if (i % 2 != 0){
        System.out.println(i);
      }
    }
  }

  // @Test
  // void addition() {
  //     assertEquals(2, 1 + 1);
  // }
}