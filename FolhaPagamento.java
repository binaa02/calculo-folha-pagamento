import java.math.BigDecimal;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class FolhaPagamento {
    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);

        String nom_func, cargo_fun, cpf_func, ind_periculosidade, ind_insalubridade;
        double val_salario, val_horaobrig, qtd_diasuteis, val_periculosidade, val_insalubridade, val_adicional;

        System.out.printf("Informar o nome do funcionario: ");
        nom_func = console.nextLine();

        System.out.printf("Informar o cargo do funcionario: ");
        cargo_fun = console.nextLine();

        System.out.printf("Informar o CPF do funcionario: ");
        cpf_func = console.nextLine();

        System.out.printf("Informar  se o trabalho tem adicional de periculosidade: ");
        ind_periculosidade = console.nextLine();

        System.out.printf("Informar  se o trabalho tem adicional de insalubridade: ");
        ind_insalubridade = console.nextLine();

        System.out.printf("Informar o salario base: ");
        val_salario = console.nextDouble();

        System.out.printf("Informar a quantidade de dias uteis: ");
        qtd_diasuteis = console.nextDouble();

        System.out.printf("Informar a horas obrigatorias: ");
        val_horaobrig = console.nextDouble();

        val_periculosidade = 0;
        if (ind_periculosidade.equals("Sim")) {
            val_periculosidade = val_salario * 0.3;
        }
        val_insalubridade = 0;
        if (ind_insalubridade.equals("Sim")) {
            val_insalubridade = val_salario * 0.2;
        }
        val_adicional = 0;
        val_adicional = val_insalubridade + val_periculosidade;

        System.out.println("##########################################################################");
        System.out.println("                                                                          ");
        System.out.println("Funcionario: " + nom_func + " | Cargo: " + cargo_fun + " | CPF: " + cpf_func);
        System.out.println("                                                                          ");
        System.out.println("Salario Base: R$: " + val_salario);
        System.out.println("                                                                          ");
        System.out.println("Adicional Salario: R$: " + val_adicional);
        System.out.println("                                                                          ");
        System.out.println("Horas Obrigatorias no mês: " + val_horaobrig * qtd_diasuteis);
        System.out.println("                                                                          ");
        System.out.println("Valor hora salario R$: " + (val_salario + val_adicional) / (val_horaobrig * qtd_diasuteis));
        System.out.println("                                                                          ");
        System.out.println("                                                                          ");
        System.out.println("##########################################################################");
    }
}
