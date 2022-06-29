import java.util.Scanner;

public class Ex16 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int a, b, c;

        System.out.printf("digite um numero: ");
        a = ler.nextInt();

        System.out.printf("digite um numero: ");
        b = ler.nextInt();

        System.out.printf("digite um numero: ");
        c = ler.nextInt();

        if (a >= b && a >= c && b >= c)
            System.out.printf("ordem crescente "+c+" " +b+" " +a);
            else if (b >= a && b >= c && a >= c)
                System.out.printf("ordem crescente "+c+ " " +a+ " "+b);
            else if (c >= a && c >= b && a >= b)
                System.out.printf("ordem crescente "+b+" " +a+" " +c);
            else if (c >= a && c >= b && b >= a)
                System.out.printf("ordem crescente "+a+" " +b+" " +c);
            else if (b >= c && b >= a && c >= a)
                System.out.printf("ordem crescente "+a+" " +c+" " +b);
            else
                System.out.printf("ordem crescente "+b+" " +c+" " +a);
    }
}
