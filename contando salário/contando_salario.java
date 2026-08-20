import java.util.Scanner;

public class contando_salario {
    public static void main(String[] args){
        try (Scanner leitor = new Scanner(System.in)) {

            System.out.print("Informe o salário base do funcionário: ");
            double salarioBase = leitor.nextDouble();
            
            double gratificacao = salarioBase * 0.05;
            double imposto = salarioBase * 0.07;
            double salarioReceber = salarioBase + gratificacao - imposto;
            
            System.out.printf("Salário base: " + salarioBase);
            System.out.printf("Grátificação: " + gratificacao);
            System.out.printf("Imposto: " + imposto);
            System.out.printf("Salário a receber: " + salarioReceber);
        }
    }
}