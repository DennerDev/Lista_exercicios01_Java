// Exercicio 18 - 

import java.util.Scanner;

class Ex18 {
    public static void main(String[] args) {
        int h1, h2, m1, m2, maxh, maxm, minh, minm;

        Scanner ler = new Scanner(System.in);

        System.out.print("");

        System.out.print("Digite a idade do 1º homem..: ");
        h1 = ler.nextInt();

        System.out.print("Digite a idade do 2º homem..: ");
        h2 = ler.nextInt();

        System.out.print("Digite a idade da 1ª mulher.: ");
        m1 = ler.nextInt();

        System.out.print("Digite a idade da 2ª mulher.: ");
        m2 = ler.nextInt();
        
        if (h1 > h2) {
            maxh = h1;
            minh = h2;
        } else {
            maxh = h2;
            minh = h1;
        }

        if (m1 > m2) {
            maxm = m1;
            minm = m2;
        } else {
            maxm = m2;
            minm = m1;
        }
        System.out.print("\nSoma do homem mais velho + mulher mais nova = " + (maxh + minm));
        System.out.print("\nProduto do homem mais novo * mulher mais velha = " + (minh * maxm));

    }
}