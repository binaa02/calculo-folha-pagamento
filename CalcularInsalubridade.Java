import java.util.Scanner;

public class CalcularInsalubridade {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double salarioMinimo = 1380.60;

        System.out.print("Informe o grau de risco (baixo, medio ou alto): ");
        String grauRisco = input.next();

        double adicional = 0;

        switch(grauRisco) {
            case "baixo":
                adicional = 0.1;
                break;
            case "medio":
                adicional = 0.2;
                break;
            case "alto":
                adicional = 0.4;
                break;
            default:
                System.out.println("Grau de risco invalido!");
                return;
        }

        double valorAdicional = salarioMinimo * adicional;

        System.out.printf("Valor do adicional: R$ %.2f\n", valorAdicional);

        input.close();
    }
}