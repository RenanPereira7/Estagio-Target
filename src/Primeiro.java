public class Primeiro {
    public static void main(String[] args) {
        int i = 13;
        int soma = 0;
        int k = 0;

        do {
            k = k + 1;
            soma = soma + k;
        } while (k < i);

        System.out.println(soma);
    }
}



