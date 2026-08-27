import java.util.Scanner;

public class OpcoesDoUsuario{
public static void main(String[] args){
Scanner scanner = new Scanner(System.in);

System.out.println("Menu de opções:");
System.out.println("1. Somar dois números.");
System.out.println("2. Número ao quadrado.");
System.out.print("Digite a opção desejada: ");
int opcao = scanner.nextInt();

switch (opcao) {
case 1: 
System.out.print("Digite o primeiro número: ");
int num1 = scanner.nextInt();
System.out.print("Digite o segundo número: ");
int num2 = scanner.nextInt();
int soma = (num1 + num2);
System.out.print("O resultado da soma é: " + soma);
break;

case 2:
System.out.print("Digite um número: ");
int num3 = scanner.nextInt();
int quadrado = (num3 * num3);
System.out.print("O resultado ao quadrado é: " + quadrado);
break;

default:
System.out.print("Opção inváldia !");

        }
scanner.close();
    }
}
