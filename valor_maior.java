import java.util.Scanner;

public class valor_maior {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

            System.out.print("Informe o primeiro valor: ");
            int N1 = leitor.nextInt();

            System.out.print("Informe o segundo valor: ");
            int N2 = leitor.nextInt();

            System.out.print("Informe o terceiro valor: ");
            int N3 = leitor.nextInt();

            if (N1 > N2 && N1 > N3) {
                System.out.print("O maior valor é:" + N1);
            }
            else if (N2 > N1 && N2 > N3) {
                System.out.print("O maior valor é:" + N2);
            }
            else {
                System.out.print("O maior valor é:" + N3);
            }
            leitor.close();
    }
}
