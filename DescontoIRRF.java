package Documents.repos.profdiegoaugusto;

import java.text.DecimalFormat;

public class IRRFCalculator {

    public static void main(String[] args) {

        double salarioBruto = 7507.49;
        int dependentes = 2;
        double inss = calcularINSS(salarioBruto);
        double baseCalculo = calcularBaseCalculo(salarioBruto, inss, dependentes);
        double irrf = calcularIRRF(baseCalculo);
        double aliquotaEfetiva = calcularAliquotaEfetiva(irrf, salarioBruto);

        DecimalFormat df = new DecimalFormat("#.00");

        System.out.println("Salário bruto: R$ " + df.format(salarioBruto));
        System.out.println("Desconto do INSS: R$ " + df.format(inss));
        System.out.println("Dedução de dependentes: R$ " + df.format(calcularDeducaoDependentes(dependentes)));
        System.out.println("Pensão alimentícia: R$ 0,00");
        System.out.println("Outras deduções: R$ 0,00");
        System.out.println("Total de deduções: R$ " + df.format(inss + calcularDeducaoDependentes(dependentes)));
        System.out.println("Base de cálculo: R$ " + df.format(baseCalculo));
        System.out.println("Desconto do IRRF: R$ " + df.format(irrf));
        System.out.println("Alíquota efetiva: " + df.format(aliquotaEfetiva * 100) + "%");

    }

    private static double calcularINSS(double salarioBruto) {
        double inss;
        if (salarioBruto <= 1100.00) {
            inss = salarioBruto * 0.075;
        } else if (salarioBruto <= 2203.48) {
            inss = salarioBruto * 0.09;
        } else if (salarioBruto <= 3305.22) {
            inss = salarioBruto * 0.12;
        } else if (salarioBruto <= 6433.57) {
            inss = salarioBruto * 0.14;
        } else {
            inss = 751.97;
        }
        return inss;
    }

    private static double calcularDeducaoDependentes(int dependentes) {
        return dependentes * 189.59;
    }

    private static double calcularBaseCalculo(double salarioBruto, double inss, int dependentes) {
        double baseCalculo = salarioBruto - inss - calcularDeducaoDependentes(dependentes);
        return baseCalculo;
    }

    private static double calcularIRRF(double baseCalculo) {
        double irrf = 0;
        if (baseCalculo <= 1903.98) {
            irrf = 0;
        } else if (baseCalculo <= 2826.65) {
            irrf = baseCalculo * 0.075 - 142.80;
        } else if (baseCalculo <= 3751.05) {
            irrf = baseCalculo * 0.15 - 354.80;
        } else if (baseCalculo <= 4664.68) {
            irrf = baseCalculo * 0.225 -
