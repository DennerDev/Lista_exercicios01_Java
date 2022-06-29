/// Exercicio 06 - 

import java.util.Scanner;

class Ex06 {
   public static void main(String[] args) {
      float peso, altura, imc;

      Scanner ler = new Scanner(System.in);

      System.out.print("Digite seu peso: ");
      peso = ler.nextFloat();

      System.out.print("Digite sua altura: ");
      altura = ler.nextFloat();

      imc = peso / (altura * altura);
      
      if (imc <= 18.5)
         System.out.print("Magro");
      else if (imc <= 25)
         System.out.print("Peso ideal");
      else if (imc <= 30)
         System.out.print("Sobrepeso");
      else
         System.out.print("Obeso");
   }
}