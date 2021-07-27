package one.innovation.digital;

import java.time.LocalDateTime;

/*********************************************************************************
 *
 * Objetivo: Adicionar 4 anos, 6 meses e 13 horas ao momento 15/05/2010 10:00:00
 * Autor   : Fernando
 * Data    : 26/07/2021
 *
 * *******************************************************************************
 */
public class Main {

    public static void main(String[] args) {
        LocalDateTime data = LocalDateTime.of(2010, 05,  15, 10, 00, 00);
        LocalDateTime dataFutura = data.plusYears(4).plusMonths(6).plusHours(13);
        System.out.println("Data Inicial: " + data);
        System.out.println("Data Futura.: " + dataFutura);

    }
}
