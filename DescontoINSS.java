import java.text.DecimalFormat;

public class CalculoINSS {

    public static void main(String[] args) {

        double salarioBruto = 7507.49; // Exemplo de salário bruto

        double inss = calcularINSS(salarioBruto);
        double aliquotaEfetiva = inss / salarioBruto;

        DecimalFormat df = new DecimalFormat("#.##");

        System.out.println("Valor do INSS a ser descontado: R$ " + df.format(inss));
        System.out.println("Alíquota efetiva do INSS: " + df.format(aliquotaEfetiva * 100) + "%");
    }

    public static double calcularINSS(double salarioBruto) {

        double valorINSS = 0.0;

        double faixa1 = 1302.0;
        double faixa2 = 2571.29;
        double faixa3 = 3856.94;
        double faixa4 = 7507.49;

        double aliquota1 = 0.075;
        double aliquota2 = 0.09;
        double aliquota3 = 0.12;
        double aliquota4 = 0.14;

        if (salarioBruto <= faixa1) {
            valorINSS = salarioBruto * aliquota1;
        }
        else if (salarioBruto <= faixa2) {
            valorINSS = (salarioBruto - faixa1) * aliquota2 + faixa1 * aliquota1;
        }
        else if (salarioBruto <= faixa3) {
            valorINSS = (salarioBruto - faixa2) * aliquota3 + (faixa2 - faixa1) * aliquota2 + faixa1 * aliquota1;
        }
        else if (salarioBruto <= faixa4) {
            valorINSS = (salarioBruto - faixa3) * aliquota4 + (faixa3 - faixa2) * aliquota3 + (faixa2 - faixa1) * aliquota2 + faixa1 * aliquota1;
        }
        else {
            valorINSS = faixa4 * aliquota4 + (faixa3 - faixa2) * aliquota3 + (faixa2 - faixa1) * aliquota2 + faixa1 * aliquota1;
        }

        // Verifica se o valor do INSS ultrapassa o teto máximo
        double tetoMaximo = 7507.49;
        if (salarioBruto > tetoMaximo) {
            valorINSS = tetoMaximo * aliquota4;
        }

        return valorINSS;
    }
}