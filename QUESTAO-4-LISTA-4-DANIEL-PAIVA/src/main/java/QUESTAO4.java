// import static org.junit.jupiter.api.Assertions.assertEquals;

// import org.junit.jupiter.api.Test;

// Supondo que a população de um país A seja da ordem de 80000 habitantes
// com uma taxa anual de crescimento de 3% e que a população de B seja 200000
// habitantes com uma taxa de crescimento de 1.5%.
// Faça um programa que calcule e escreva o número de anos necessários para
// que a população do país A ultrapasse ou iguale a população do país B,
// mantidas as taxas de crescimento 

public class QUESTAO4 {
  public static void main(String[] args) {

    int a = 80000;
    double crescA = 0.03;

    int b = 200000;
    double crescB = 0.015;

    int anos = 0;

    while (a <= b) {
      a = a + (int) (a * crescA);
      b = b + (int) (b * crescB);
      anos++;
    }
    System.out.println("Vai demorar " + anos + " anos para a população de A ultrapassar a população de B");
  }

  // @Test
  // void addition() {
  // assertEquals(2, 1 + 1);
  // }
}