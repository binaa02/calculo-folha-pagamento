import java.util.Scanner

public class CalcularSalarioHora {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Obter valores do usuário
        System.out.print("Informe o salário bruto: ");
        double salarioBruto = sc.nextDouble();

        System.out.print("Informe a quantidade de horas trabalhadas por dia: ");
        int horasPorDia = sc.nextInt();

        System.out.print("Informe a quantidade de dias trabalhados por semana: ");
        int diasPorSemana = sc.nextInt();

        // Realizar cálculos
        int horasPorSemana = horasPorDia * diasPorSemana;
        int horasPorMes = horasPorSemana * 4; // Considerando um mês com 4 semanas
        double salarioHora = salarioBruto / horasPorMes;

        // Exibir resultado
        System.out.printf("Salário por hora: R$ %.2f", salarioHora);

        sc.close();
    }
}


