import java.util.Scanner;

public class Dividir {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        double n1 = leitor.nextDouble();

        System.out.print("Digite o segundo número: ");
        double n2 = leitor.nextDouble();

        double resultado = n1 / n2;

        System.out.println("O resultado da divisão foi: " + resultado);

        leitor.close();
    }
}