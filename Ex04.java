// Exercico 04 - (Concluido)

import java.util.Scanner;

class Ex04 {
    public static void main(String[] args) {
        int A, B;
        Scanner ler = new Scanner(System.in);

        System.out.print("Digite o  primeiro número: ");
        A = ler.nextInt();

        System.out.print("Digite o segundo número: ");
        B = ler.nextInt();

        if (A > B)
            System.out.print(" " + B + " e " + A);
        else if (A < B)
            System.out.print(" " + A + " e " + B);
        else
            System.out.print("iguais");
    }
}
