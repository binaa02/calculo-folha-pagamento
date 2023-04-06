public class ValeAlimentacao {
    public static void main(String[] args) {
        // Informações do funcionário
        double valorDiario = 24.00; // Valor do vale alimentação diário
        int diasTrabalhados = 26; // Quantidade de dias úteis trabalhados no mês

        // Cálculo do valor do vale alimentação
        double valorMensal = valorDiario * diasTrabalhados;

        // Exibição do resultado
        System.out.println("Valor do Vale Alimentação: R$" + valorMensal);
    }
}