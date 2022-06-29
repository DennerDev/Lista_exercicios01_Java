// Exercicio 11 - Concluido

import java.util.Scanner;

public class Ex11 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        float x, y;

        System.out.print("Digite o valor de Y: ");
        y = ler.nextFloat();

        System.out.print("Digite o valor de X: ");
        x = ler.nextFloat();

        if             (y > 0 && x > 0)      System.out.println("Primeiro Quadrante ");
          else if      (y > 0 && x < 0)      System.out.println("Segundo Quadrante  ");
            else if    (y < 0 && x < 0)      System.out.println("Terceiro Quadrante ");
             else if   (y < 0 && x > 0)      System.out.println("Quarto Quadrante   ");
               else if (x == 0 &&  y==0)     System.out.println("Origem             ");
                else if(x == 0 && y!=0)      System.out.println("Exixo Y            ");
                 else                        System.out.println("Exixo X            ");
                
    }
}
