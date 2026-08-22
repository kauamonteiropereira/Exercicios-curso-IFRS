import java.util.Scanner;

public class realmente_formam_triangulo{
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

            System.out.print("Digite o primeiro lado: ");
            int L1 = leitor.nextInt();

            System.out.print("Digite o segundo lado: ");
            int L2 = leitor.nextInt();

              System.out.print("Digite o terceiro lado: ");
            int L3 = leitor.nextInt();

            if (L1 + L2 > L3 && L1 + L3 > L2 && L2 + L3 > L1 ){
                System.out.print("Formam triângulo");

            }
            else {
                System.out.print("Não formam triângulo");
            }

            leitor.close();
    }        
}