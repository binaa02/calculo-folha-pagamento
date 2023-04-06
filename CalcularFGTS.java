package Documents.repos.profdiegoauguto
import java.math.BigDecimal;
public class CalculadoraFGTS {

    public static BigDecimal calcularFGTS(BigDecimal salarioBruto) {
        BigDecimal percentualFGTS = new BigDecimal("0.08");
        return salarioBruto.multiply(percentualFGTS);
    }

    public static void main(String[] args) {
        BigDecimal salarioBruto = new BigDecimal("3000.00");
        BigDecimal fgts = calcularFGTS(salarioBruto);
        System.out.printf("Salário bruto: R$ %.2f\n", salarioBruto);
        System.out.printf("FGTS a recolher: R$ %.2f\n", fgts);
    }
}
