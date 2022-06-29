//Exercicio - 09  (Concluido)


import java.util.Scanner;

public class Ex09 {
    public static void main(String[] args) {
       int ponto;
       
       Scanner ler = new Scanner(System.in);

       System.out.print("Digite sua pontuação na avaliação <0 até 100>: ");
       ponto = ler.nextInt();

       if       (ponto <=   0)       System.out.println("Pontuação Inválida");
       else if  (ponto <=  30)       System.out.println("Regular");
       else if  (ponto <=  60)       System.out.println("Bom");
       else if  (ponto <=  90)       System.out.println("Muito bom");
       else if  (ponto <= 100)       System.out.println("Otim");
       else                          System.out.println("Inválido");;
    }
}
