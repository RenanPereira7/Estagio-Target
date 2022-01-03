import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String palavra;

        System.out.println("Digite a palavra para inverter: " );
        palavra = scan.next();

        System.out.println(new StringBuilder(palavra).reverse());

    }
}
