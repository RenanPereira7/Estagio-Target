/*
2) Dado a sequência de Fibonacci, onde se inicia por 0 e 1 e o próximo valor sempre será a soma dos 2 valores
anteriores (exemplo: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34...),
escreva um programa na linguagem que desejar onde, informado um número, ele calcule
a sequência de Fibonacci e retorne uma mensagem avisando se o número informado pertence ou não a sequência.
 */
import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numero1 = 0;
        int numero2 = 1;
        int sequencia;

        System.out.println("Digite o numero que ira terminar a sequencia de finobbacci:");
        sequencia = scan.nextInt();

        do {
            System.out.print(numero1 + " ");
            int soma = numero1 + numero2;
            numero1 = numero2;
            numero2 = soma;

        } while (numero1 <= sequencia);

        if (sequencia != numero1) {
            System.out.println("\nO numero não pertence a sequencia de finobacci: ");
        }else{
            System.out.println("\nO numero pertence a sequencia de finobacci: ");
        }



    }
}
