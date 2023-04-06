package Documents.repos.profdiegoaugusto;

import java.math.BigDecimal;

public class ExemploBigDecimal {

    public static void main(String[] args) {

        // Criar dois objetos BigDecimal
        BigDecimal num1 = new BigDecimal("10.5");
        BigDecimal num2 = new BigDecimal("20.25");

        // Realizar a multiplicação
        BigDecimal resultado = num1.multiply(num2);

        // Imprimir o resultado
        System.out.println("O resultado da multiplicação é: " + resultado);
    }
}
