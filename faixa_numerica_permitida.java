import java.util.Scanner;

public class faixa_numerica_permitida {
    public static void main(String[] args){

        Scanner leitor = new Scanner(System.in);

        System.out.print("Escreva um valor númerico: ");
        int numero = leitor.nextInt();

        if (numero >= 1 && numero <= 9){
            System.out.print("O valor está dentro da faixa permitida");
            
        }
        else {
            System.out.print("O valor está fora da faixa permitida");

        }
            leitor.close();
    }
}