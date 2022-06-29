// Exercico 05 - (Concluido)

/*
Faça um programa em JAVA que leia o valor atual do salário de um funcionário.
Informe o valor de seu salário REAJUSTADO, de acordo com os percentuais indicados a seguir:
50% para aqueles que recebem até R$ 2.000,00.
20% para aqueles que recebem mais de R$ 2.000,00 e menos de R$ 5.000,00.
10% para os demais.
*/

import java.util.Scanner;
class Ex05
{
  public static void main(String[] args) 
  { 
    Scanner ler = new Scanner (System.in);
    float   sal;
    System.out.print("Digite seu salário: ");

    sal = ler.nextFloat();

    if      (sal <= 2000)        System.out.printf ("Ganhou 50%% de aumento: %.2f reais " , (sal*1.50));
    else if (sal <= 5000)        System.out.printf ("Ganhou 20%% de aumento: %.2f reais " , (sal*1.20));
    else                         System.out.printf ("Ganhou 10%% de aumento: %.2f reais " , (sal*1.10));    
  }
}
