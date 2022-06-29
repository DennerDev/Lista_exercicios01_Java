import java.util.Scanner;

public class Ex13 {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        int num;

        System.out.printf("Digite o valor inteiro: ");
        num = ler.nextInt();

        System.out.printf("\nmoedas de 100 ---> " + num / 100);
        num = num % 100;

        System.out.printf("\nmoedas de 50 ----> "+ num / 50);
        num = num % 50;

        
        System.out.printf("\nmoedas de 10 ----> "+ num / 10);
        num = num % 10;

        System.out.printf("\nmoedas de 5 -----> "+ num / 5);
        num = num % 5;

        System.out.printf("\nmoedas de 1 -----> "+ num / 1);
        num = num % 1;

    }
}
