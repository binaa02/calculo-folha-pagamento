import java.util.Scanner

public class Benefícios {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe o salário bruto do funcionário:");
        double salarioBruto = scanner.nextDouble();

        // Calcula o valor do salário por hora
        double salarioHora = salarioBruto / 220; // assumindo 220 horas trabalhadas no mês
        System.out.println("O valor do salário por hora é: " + salarioHora);

        // Verifica se o funcionário tem direito a adicional de periculosidade
        System.out.println("O funcionário tem direito a adicional de periculosidade? (S/N)");
        String opcaoPericulosidade = scanner.next().toUpperCase();
        double adicionalPericulosidade = 0;

        if (opcaoPericulosidade.equals("S")) {
            adicionalPericulosidade = salarioBruto * 0.3;
            System.out.println("O adicional de periculosidade é de: " + adicionalPericulosidade);
        }

        // Verifica se o funcionário tem direito a adicional de insalubridade
        System.out.println("O funcionário tem direito a adicional de insalubridade? (S/N)");
        String opcaoInsalubridade = scanner.next().toUpperCase();
        double adicionalInsalubridade = 0;

        if (opcaoInsalubridade.equals("S")) {
            adicionalInsalubridade = salarioBruto * 0.2;
            System.out.println("O adicional de insalubridade é de: " + adicionalInsalubridade);
        }

        // Calcula o valor do vale transporte
        System.out.println("Informe o valor do vale transporte:");
        double valorValeTransporte = scanner.nextDouble();
        double beneficioValeTransporte = valorValeTransporte * 0.06;
        System.out.println("O valor do benefício vale transporte é de: " + beneficioValeTransporte);

        // Calcula o valor do vale alimentação
        System.out.println("Informe o valor do vale alimentação:");
        double valorValeAlimentacao = scanner.nextDouble();
        double beneficioValeAlimentacao = valorValeAlimentacao * 0.1;
        System.out.println("O valor do benefício vale alimentação é de: " + beneficioValeAlimentacao);

        // Calcula o valor do INSS
        double inss = salarioBruto * 0.1;
        System.out.println("O valor do desconto de INSS é de: " + inss);

        // Calcula o valor do FGTS
        double fgts = salarioBruto * 0.08;
        System.out.println("O valor do desconto de FGTS é de: " + fgts);

        // Calcula o valor do IRRF
        double irrf = 0;
        double salarioBase = salarioBruto + adicionalPericulosidade + adicionalInsalubridade + beneficioValeTransporte + beneficioValeAlimentacao;
        double baseCalculoIRRF = salarioBase - inss;
        if (baseCalculoIRRF <= 1903.98) {
            irrf = 0;
        } else if (baseCalculoIRRF <= 2826.65) {
            irrf = baseCalculoIRRF *
        }
    }