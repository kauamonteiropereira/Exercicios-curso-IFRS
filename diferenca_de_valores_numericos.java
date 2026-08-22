import java.util.Scanner;

public class diferenca_de_valores_numericos {
    public static void main(String[] args){

        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int numero1 = leitor.nextInt();

        System.out.print("Digite o segundo número: ");
        int numero2 = leitor.nextInt();

            if (numero1 == numero2) {
                System.out.print("O resultado é igual a: 0");
            }
                else if (numero1 > numero2){
                System.out.print("O resultado é igual a: " + (numero1 - numero2));
            }
                else {
                System.out.print("O resultado é igual a: " + (numero2 - numero1));

            }
                leitor.close();
    }   
}