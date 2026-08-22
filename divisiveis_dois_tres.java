import java.util.Scanner;

public class divisiveis_dois_tres {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite o primeiro valor: ");
        int valor1 = leitor.nextInt();

        System.out.print("Digite o segundo valor: ");
        int valor2 = leitor.nextInt();

        System.out.print("Digite o terceiro valor: ");
        int valor3 = leitor.nextInt();

        System.out.print("Digite o quarto valor: ");
        int valor4 = leitor.nextInt();

        if (valor1 % 2 == 0 && valor1 % 3 == 0) {
            System.out.print(valor1 + " ");
        }

        if (valor2 % 2 == 0 && valor2 % 3 == 0) {
            System.out.print(valor2 + " ");
        }

        if (valor3 % 2 == 0 && valor3 % 3 == 0) {
            System.out.print(valor3 + " ");
        }

        if (valor4 % 2 == 0 && valor4 % 3 == 0) {
            System.out.print(valor4 + " ");
        }
        leitor.close();
    }     
}