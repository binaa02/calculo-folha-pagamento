import java.util.Scanner;

public class Funcionários {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Funcionario[] funcionarios = new Funcionario[100];
        int numFuncionarios = 0;

        while (true) {
            System.out.println("Escolha uma opção:");
            System.out.println("1 - Cadastrar um novo funcionário");
            System.out.println("2 - Listar todos os funcionários cadastrados");
            System.out.println("3 - Buscar um funcionário pelo CPF");
            System.out.println("4 - Sair do programa");

            int opcao = scanner.nextInt();

            if (opcao == 1) {
                scanner.nextLine(); // limpa o buffer do teclado

                System.out.println("Digite o nome do funcionário:");
                String nome = scanner.nextLine();

                System.out.println("Digite o CPF do funcionário:");
                String cpf = scanner.nextLine();

                System.out.println("Digite o cargo do funcionário:");
                String cargo = scanner.nextLine();

                System.out.println("Digite o salário base do funcionário:");
                double salarioBase = scanner.nextDouble();

                System.out.println("Digite o número de horas trabalhadas pelo funcionário:");
                int horasTrabalhadas = scanner.nextInt();

                System.out.println("Digite o valor dos adicionais do funcionário:");
                double adicionais = scanner.nextDouble();

                System.out.println("Digite o valor dos descontos do funcionário:");
                double descontos = scanner.nextDouble();

                System.out.println("Digite o valor dos benefícios do funcionário:");
                double beneficios = scanner.nextDouble();

                Funcionario novoFuncionario = new Funcionario(nome, cpf, cargo, salarioBase, horasTrabalhadas, adicionais, descontos, beneficios);

                funcionarios[numFuncionarios] = novoFuncionario;
                numFuncionarios++;

                System.out.println("Funcionário cadastrado com sucesso!");

            } else if (opcao == 2) {
                System.out.println("Lista de funcionários:");

                for (int i = 0; i < numFuncionarios; i++) {
                    Funcionario f = funcionarios[i];
                    System.out.println("Nome: " + f.getNome());
                    System.out.println("CPF: " + f.getCpf());
                    System.out.println("Cargo: " + f.getCargo());
                    System.out.println("Salário Líquido: " + f.calcularSalarioLiquido());
                    System.out.println("Adicionais: " + f.getAdicionais());
                    System.out.println("Descontos: " + f.getDescontos());
                    System.out.println("Benefícios: " + f.getBeneficios());
                    System.out.println();
                }

            } else if (opcao == 3) {
                scanner.nextLine(); // limpa o buffer do teclado

                System.out.println("Digite o CPF do funcionário que deseja buscar:");
                String cpf = scanner.nextLine();

                boolean encontrado = false;

                for (int i = 0; i < numFuncionarios; i++) {
                    Funcionario f = funcionarios[i];

                    if (f.getCpf().equals(cpf)) {
                        System.out.println("Nome: " + f.getNome());
                        System.out.println("CPF: " + f.getCpf());
                        System.out.println("Cargo: " + f.getCargo());
                        System.out.println("Salário Líquido: " +

                    }
                }
            }
        }
    }


