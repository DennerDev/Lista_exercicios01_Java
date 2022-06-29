import java.util.Scanner;

public class Ex14 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        int a, b ,c ;

        System.out.printf("Digite o 1º nº: ");
        a = ler.nextInt();

        System.out.printf("Digite o 2º nº: ");
        b = ler.nextInt();

        System.out.printf("Digite o 3º nº: ");
        c = ler.nextInt();

        if ((a==b)&& (a==c)&& (b==c))  System.out.printf("Os números são iguais");
           else if ( (a>b) && (a>=c))     System.out.printf("O maior é  "+ a);
            else if ( (b>=a) && (b>c))     System.out.printf ("O maior é  "+ b);
             else                            System.out.printf ("O maior é  " + c);
    }
}
