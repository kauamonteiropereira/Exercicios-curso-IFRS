import java.util.Scanner;

public class aumento_salario_de_funcionario {
public static void main(String[] args) {
Scanner leitor = new Scanner(System.in);

System.out.print("Informe o salário do funcionário: ");
double salario = leitor.nextDouble();

if (salario < 5000) {
        salario = salario + (salario * 0.30);
        }
else {
        }
System.out.print("O novo salário é de: " + salario);

leitor.close();
    }
}
