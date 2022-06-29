
// Exercicio 07 -  (Concluido)

import java.util.Scanner;

public class Ex07 {
    public static void main(String[] args) {
       Scanner ler = new Scanner (System.in); 

       int n1, n2;

       System.out.print("Digite a quantidade de GOLS marcados pela Unicid: ");
       n1 = ler.nextInt();

       System.out.print("Digite a quantidade de GOLS marcados pela Universidade Visitante: ");
       n2 = ler.nextInt();

       if      (n1 > n2)    System.out.println("Vitoria da Unicid ");
       else if (n1 < n2)    System.out.println("Derrota da Unicid!!. Vitoria da Universidade visitante! ");
       else                 System.out.println("O Jogo Termina empatado!!");
    }
}
