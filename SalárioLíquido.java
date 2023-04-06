package Documents.repos.profdiegoaugusto;

import java.text.DecimalFormat;

public class CalculadoraSalarioLiquido {

    public static void main(String[] args) {

        // Salário bruto e número de dependentes
        double salarioBruto = 5000.00;
        int numDependentes = 2;

        // Desconto do INSS
        double descontoINSS = calcularINSS(salarioBruto);

        // Desconto do IRRF
        double descontoIRRF = calcularIRRF(salarioBruto, numDependentes, descontoINSS);

        // Cálculo do salário líquido
        double salarioLiquido = salarioBruto - descontoINSS - descontoIRRF;

        // Formatação do resultado
        DecimalFormat df = new DecimalFormat("#,##0.00");

        // Impressão do resultado
        System.out.println("Salário bruto: R$" + df.format(salarioBruto));
        System.out.println("Desconto do INSS: R$" + df.format(descontoINSS));
        System.out.println("Desconto do IRRF: R$" + df.format(descontoIRRF));
        System.out.println("Salário líquido: R$" + df.format(salarioLiquido));
    }

    // Método para calcular o desconto do INSS
    public static double calcularINSS(double salarioBruto) {
        if (salarioBruto <= 1100.00) {
            return salarioBruto * 0.075;
        } else if (salarioBruto <= 2203.48) {
            return salarioBruto * 0.09 - 16.50;
        } else if (salarioBruto <= 3305.22) {
            return salarioBruto * 0.12 - 82.60;
        } else if (salarioBruto <= 6433.57) {
            return salarioBruto * 0.14 - 148.71;
        } else {
            return 751.99;
        }
    }

    // Método para calcular o desconto do IRRF
    public static double calcularIRRF(double salarioBruto, int numDependentes, double descontoINSS) {
        double baseCalculo = salarioBruto - descontoINSS - numDependentes * 189.59;
        if (baseCalculo <= 1903.98) {
            return 0.0;
        } else if (baseCalculo <= 2826.65) {
            return baseCalculo * 0.075 - 142.80;
        } else if (baseCalculo <= 3751.05) {
            return baseCalculo * 0.15 - 354.80;
        } else if (baseCalculo <= 4664.68) {
            return baseCalculo * 0.225 - 636.13;
        } else {
            return baseCalculo * 0.275 - 869.36;
        }
    }
}