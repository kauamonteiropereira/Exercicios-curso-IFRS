import java.util.Scanner;

public class LerAnoDiasEMes {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite o dia: ");
        int dia = leitor.nextInt();

        System.out.print("Digite o mês: ");
        int mes = leitor.nextInt();

        System.out.print("Digite o ano: ");
        int ano = leitor.nextInt();

        String nomeMes;
        switch (mes) {
            case 1:
                nomeMes = "Janeiro";
                break;
            case 2:
                nomeMes = "Fevereiro";
                break;
            case 3:
                nomeMes = "Março";
                break;
            case 4:
                nomeMes = "Abril";
                break;
            case 5:
                nomeMes = "Maio";
                break;
            case 6:
                nomeMes = "Junho";
                break;
            case 7:
                nomeMes = "Julho";
                break;
            case 8:
                nomeMes = "Agosto";
                break;
            case 9:
                nomeMes = "Setembro";
                break;
            case 10:
                nomeMes = "Outubro";
                break;
            case 11:
                nomeMes = "Novembro";
                break;
            case 12:
                nomeMes = "Dezembro";
                break;
            default:
                nomeMes = "mês inválido";
                break;
        }

        System.out.println(dia + " de " + nomeMes + " de " + ano);
    }
}
