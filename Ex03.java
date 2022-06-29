// Exrcicio 03 - (Concluido)

/**
 * Faça um programa em JAVA que peça para o usuário digitar o salário e o total gasto no mês.
O programa deverá apresentar na tela:
“Gastos dentro do orçamento” >>> se o valor gasto não ultrapassar o valor do salário.
“Orçamento estourado” >>> se o valor gasto ultrapassar o valor do salário.
 */

import java.util.Scanner;

 class Ex03  {
   public static void main(String[] args) {
       float salario,gastos;
       
       Scanner ler = new Scanner (System.in);

       System.out.print("Digite seu salário: ");
       salario = ler.nextFloat();
       System.out.print("digite quenato gastou no mês: ");
       gastos= ler.nextFloat();

      if      (salario > gastos)     System.out.printf ("Gastos dentro do orçamento " );
      else                           System.out.printf ("Orçamento estourado " );
   } 
}