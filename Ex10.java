// Exercico 10 -

import java.util.Scanner;

public class Ex10 {
   public static void main(String[] args) {
      Scanner ler = new Scanner(System.in);

      char sexo;
      float alt;

      System.out.println("Digite seu sexo <F/M>:");
      sexo = ler.next().charAt(0);

      if (sexo != 'f' && sexo != 'F' && sexo != 'M' && sexo != 'm')
         System.out.println("Sexo Invalido, apenas F ou M: ");
      else {
         System.out.println("Digite sua altura: ");
         alt = ler.nextFloat();

         if ((sexo == 'F') && (sexo == 'f'))
            System.out.printf("\nVocê é homem e seu peso ideal é %.2f ", (72.7 * alt - 58));

         else
            System.out.printf("\nVocê é mulher e seu peso ideal é %.2f ", (62.1 * alt - 44.7));

      }

   }
}
