cat > medidas_quadrado.java << 'EOF'
import java.util.Scanner;

public class medidas_quadrado {
    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);

        System.out.print("Informe o primeiro lado: ");
        double lado1 = leitor.nextDouble();

        System.out.print("Informe o segundo lado: ");
        double lado2 = leitor.nextDouble();

        double medidas = lado1 * lado2;

        System.out.println("As medidas do objeto são: " + medidas);

        leitor.close();
    }
}
