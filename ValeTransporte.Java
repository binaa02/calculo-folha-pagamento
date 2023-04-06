import java.util.Scanner;

public class ValeTransporte {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o salário bruto: ");
        double salarioBruto = input.nextDouble();

        System.out.print("Digite o valor total dos vales transportes recebidos: ");
        double valorVT = input.nextDouble();

        double percentualDesconto = 0.06;
        double valorMaximoDesconto = salarioBruto * percentualDesconto;

        double valorDesconto = 0.0;
        if (valorVT < valorMaximoDesconto) {
            valorDesconto = valorVT;
        } else {
            valorDesconto = valorMaximoDesconto;
        }

        System.out.printf("Valor a descontar: R$ %.2f", valorDesconto);
    }

}