// Exercicio 08 -  

import java.util.Scanner;

class Ex08{
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        float n1, n2, n3,rec,med;

        System.out.printf("Digite a primeira nota do aluno: ");
        n1 = ler.nextFloat();

        System.out.printf("Digite a segunda nota do aluno: ");
        n2 = ler.nextFloat();

        System.out.printf("Digite a terceira nota do aluno: ");
        n3 = ler.nextFloat();

        med = (n1+n2+n3)/3;
        if (med >= 7) System.out.print("Você está Aprovado");
        else { 
          System.out.printf("Nota da recuperação: ");
        rec = ler.nextFloat();
         if (rec >= 5) System.out.printf("aprovado na recuperação");
         else if (rec < 5) System.out.printf("reprovado na recuperação");
        } 
    }
}