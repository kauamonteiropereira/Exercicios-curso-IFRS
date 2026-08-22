import java.util.Scanner;

public class calcuar_delta {
    public static void main(String[] args){

        Scanner leitor = new Scanner(System.in);

            System.out.print("Digite o primeiro valor: ");
            int A = leitor.nextInt();

            System.out.print("Digite o segundo número: ");
            int B = leitor.nextInt();

            System.out.print("Digite o terceiro número: ");
            int C = leitor.nextInt();

            int delta = (B * B) - (4 * A * C);

            if (delta == 0) {
                System.out.print("É uma raiz real");

            }
            else if (delta > 0){
                System.out.print("Duas raizes reais");
            }
            else {
                System.out.print("Não possui raizes reais");
            }
            leitor.close();
    }
}

