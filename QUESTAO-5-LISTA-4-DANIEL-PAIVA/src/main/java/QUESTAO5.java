// import static org.junit.jupiter.api.Assertions.assertEquals;

// import org.junit.jupiter.api.Test;

//Altere o programa anterior permitindo ao usuário informar as populações e as
// taxas de crescimento iniciais. Valide a entrada e permita repetir a operação.

  import java.util.Scanner;

  public class QUESTAO5 {
      public static void main(String[] args) {
          Scanner enterScanner = new Scanner(System.in);
          boolean loop = true;

          while (loop) {
          double a;
          double crescA;
          double taxaA;
          double b;
          double crescB;
          double taxaB;
          int anos = 0;
          char sair;

       System.out.println("Digite a população da cidade A:");
        a = enterScanner.nextDouble();

       System.out.println("Digite a taxa de crescimento da cidade A:");
        crescA = enterScanner.nextDouble();

        taxaA = crescA / 100.0;

      System.out.println("Digite a população da cidade B:");
        b = enterScanner.nextDouble();

      System.out.println("Digite a taxa de crescimento da cidade B:");
        crescB = enterScanner.nextDouble();

        taxaB = crescB / 100.0;

       while (a <= b) {
         a += a * taxaA;
         b += b * taxaB;
         anos++;
              }
          System.out.println("Vai demorar " + anos + " anos para a população de A ultrapassar a população de B");

          System.out.println("Deseja:\ncontinuar(S) ou sair(N)");
              sair = enterScanner.next().charAt(0);

              if (sair == 'N' || sair == 'n') {
                  loop = false;
              }
          }
          enterScanner.close();
      }
  }

// @Test
// void addition() {
// assertEquals(2, 1 + 1);
// }
