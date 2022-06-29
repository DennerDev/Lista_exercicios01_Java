import java.util.Scanner;

class Ex15 {
    public static void main(String[] args) {
        int a, b, c;
        
        Scanner ler = new Scanner(System.in);

        System.out.print("digite um numero: ");
        a = ler.nextInt();

        System.out.print("digite outro numero: ");
        b = ler.nextInt();

        System.out.print("digite outro numero: ");
        c = ler.nextInt();

        if (a > c && b > c)
            System.out.println("a soma dos dois maiores é " + (a + b));
        else if (a > b && c > b)
            System.out.println("a soma dos dois maiores é " + (a + c));
        else if (b > a && c > a)
            System.out.println("a soma dos dois maiores é " + (b + c));
        else
            System.out.println("a soma dos dois maiores numeros é " + (a + b));
    }
}