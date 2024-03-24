// import static org.junit.jupiter.api.Assertions.assertEquals;

// import org.junit.jupiter.api.Test;

// Faça um programa que imprima na tela os números de 1 a 20, um abaixo do
// outro. Depois modifique o programa para que ele mostre os números um ao
// lado do outro.
  
    public class QUESTAO6 {
        public static void main(String[] args) {
            System.out.println("Numeros de 1 a 20:");
            for (int i = 1; i <= 20; i++) {
                System.out.println(i);
            }

            System.out.println("\nNumeros de 1 a 20:");
            for (int j = 1; j <= 20; j++) {
                System.out.print(j + " ");
            }
        }
      
    }


  // @Test
  // void addition() {
  //     assertEquals(2, 1 + 1);
  // }
