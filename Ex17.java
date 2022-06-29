import java.util.Scanner;

class Ex17 {
    public static void main(String[] args) {
        char tipo;
        float li;

        Scanner ler = new Scanner(System.in);

        System.out.print("Digite o tipo de combustível <A/G>:");
        tipo = ler.nextLine().toUpperCase().charAt(0);

        if (tipo != 'a' && tipo != 'A' && tipo != 'g' && tipo != 'G')
            System.out.printf("Tipo de combustível inválido!!");
        else {
            System.out.print("Quantos litros? ");
            li = ler.nextFloat();
            if (tipo == 'a' || tipo == 'A') {
                if (li <= 20)
                    System.out.printf("Álcool: 3%% de desconto e pagará  reais: " + (li * 3.90 * 0.97));
                else
                    System.out.printf("Álcool: 5%% de desconto e pagará  reais: " + (li * 3.90 * 0.95));
            } else if (li <= 20)
                System.out.printf("Gasolina: 4%% de desconto e pagará  reais: " + (li * 5.30 * 0.96));
            else
                System.out.printf("Gasolina: 6%% de desconto e pagará  reais: " + (li * 5.30 * 0.94));
        }

    }
}