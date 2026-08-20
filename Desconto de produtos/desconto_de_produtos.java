import java.util.Scanner;

public class desconto_de_produtos {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite o valor do produto :");
        double V1 = leitor.nextDouble(); 

        System.out.print("Digite o percentual de desconto: ");
        double D = leitor.nextDouble();      

        double desconto = V1 * (D / 100.0);
        double valorFinal = V1 - desconto;

        System.out.println("Você recebeu um desconto de: " + desconto + " no valor da compra");
        System.out.println("Valor final: " + valorFinal);

        leitor.close();
    }

}

