package Documents.repos.profdiegoaugusto;

import java.util.Scanner;

public class FolhaDePagamento {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Informações do colaborador
        System.out.print("Nome do colaborador: ");
        String nome = scanner.nextLine();
        System.out.print("Data de admissão: ");
        String dataAdmissao = scanner.nextLine();
        System.out.print("Mês de referência: ");
        String mesReferencia = scanner.nextLine();
        System.out.print("Cargo do colaborador: ");
        String cargo = scanner.nextLine();
        System.out.print("Salário do colaborador: ");
        double salario = scanner.nextDouble();

        // Cálculos
        double valorHora = salario / 220;
        double inss = salario * 0.11;
        double fgts = salario * 0.08;
        double irrf = salario > 1903.98 ? (salario * 0.075) - 142.80 : 0;
        double valorBruto = salario + fgts;
        double valorLiquido = salario - inss - irrf;

        // Proventos e Descontos
        System.out.println("\nPROVENTOS");
        System.out.printf("%-20s R$ %.2f\n", "Salário", salario);
        System.out.printf("%-20s R$ %.2f\n", "FGTS", fgts);

        System.out.println("\nDESCONTOS");
        System.out.printf("%-20s R$ %.2f\n", "INSS", inss);
        System.out.printf("%-20s R$ %.2f\n", "IRRF", irrf);

        // Resultados
        System.out.println("\nRESULTADOS");
        System.out.printf("%-20s %s\n", "Nome do colaborador:", nome);
        System.out.printf("%-20s %s\n", "Data de admissão:", dataAdmissao);
        System.out.printf("%-20s %s\n", "Mês de referência:", mesReferencia);
        System.out.printf("%-20s %s\n", "Cargo do colaborador:", cargo);
        System.out.printf("%-20s R$ %.2f\n", "Salário bruto:", valorBruto);
        System.out.printf("%-20s R$ %.2f\n", "Salário líquido:", valorLiquido);
        System.out.printf("%-20s R$ %.2f\n", "Valor por hora:", valorHora);
        System.out.printf("%-20s R$ %.2f\n", "Base de cálculo INSS:", salario);
        System.out.printf("%-20s R$ %.2f\n", "Base de cálculo IRRF:", salario - inss);
    }
}