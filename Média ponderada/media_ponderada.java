import java.util.Scanner;

public class media_ponderada {
    public static void main (String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite a sua primeira nota: ");
        double nota1 = leitor.nextDouble();

        System.out.print("Digite a sua segunda nota: ");
        double nota2 = leitor.nextDouble();

        System.out.print("Digite sua terceira nota: ");
        double nota3 = leitor.nextDouble();

        System.out.print("Digite o peso da primeira nota: ");
        double peso1 = leitor.nextDouble();

        System.out.print("Digite o peso da segunda nota: ");
        double peso2 = leitor.nextDouble();

        System.out.print("Digite o peso da terceira nota: ");
        double peso3 = leitor.nextDouble();

        double somaPonderada = (nota1 * peso1) + (nota2 * peso2) + (nota3 * peso3);
        double somaPesos = peso1 + peso2 + peso3;
        double mediaPonderada = somaPonderada / somaPesos;

        System.out.printf("A média ponderada dessas notas é: %.2f%n", mediaPonderada);

        leitor.close();
    }
}