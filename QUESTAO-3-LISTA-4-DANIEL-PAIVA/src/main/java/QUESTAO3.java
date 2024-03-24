// import static org.junit.jupiter.api.Assertions.assertEquals;

// import org.junit.jupiter.api.Test;
// Faça um programa que leia e valide as seguintes informações:
// Nome: maior que 3 caracteres;
// Idade: entre 0 e 150;
// Salário: maior que zero;
// Sexo: 'f' ou 'm';
// Estado Civil: 's', 'c', 'v', 'd';

  import java.util.Scanner;

public class QUESTAO3 {
      public static void main(String[] args) {
          Scanner enterScanner = new Scanner(System.in);

          String nome;
          int idade;
          float salario;
          char sexo;
          char estadoCivil;

          do{
              System.out.println("Digite seu nome");
              nome = enterScanner.next();
          } while (nome.length()<=3);

          do{
              System.out.println("Digite sua idade");
              idade = enterScanner.nextInt();
          } while(idade < 0 || idade > 150);

          do{
              System.out.println("Digite seu salário");
              salario = enterScanner.nextFloat();
          }while (salario<=0);

          do {
              System.out.println("Digite seu sexo 'f' ou 'm'");
              sexo = enterScanner.next().charAt(0);
          } while (sexo != 'm' && sexo !='f');

          do{
              System.out.println("Digite seu estado civil: \n's' Solteiro \n'c' casado \n'v' para viúvo \n'd' divorciado");
              estadoCivil = enterScanner.next().charAt(0);
          } while ( estadoCivil != 's' &&  estadoCivil != 'c' &&  estadoCivil != 'v' &&  estadoCivil != 'd' );


          enterScanner.close();
      }

  }
  // @Test
  // void addition() {
  //     assertEquals(2, 1 + 1);
  // }
