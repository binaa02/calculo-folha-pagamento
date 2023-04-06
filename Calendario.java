package Documents.repos.profdiegoaugusto;

import java.util.Calendar;

public class VerificarSemanasDoMes {

    public static void main(String[] args) {

        // Obter a instância do calendário para o mês corrente
        Calendar cal = Calendar.getInstance();

        // Definir o primeiro dia do mês corrente
        cal.set(Calendar.DAY_OF_MONTH, 1);

        // Obter o número de semanas do mês corrente
        int numSemanas = cal.getActualMaximum(Calendar.WEEK_OF_MONTH);

        // Imprimir o número de semanas do mês corrente
        System.out.println("O mês corrente tem " + numSemanas + " semanas.");
    }
}

