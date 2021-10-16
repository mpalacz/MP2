package Ćwiczenia2;

import java.math.BigDecimal;
import java.sql.SQLOutput;

public class Zadanie5 {
    public static void main(String[] args) {
        double nettoDoublePalacz = 9.99;
        double vatDoublePalacz = 1.23;
        double bruttoDoublePalacz = nettoDoublePalacz * vatDoublePalacz;
        double bruttoTysiacDoublePalacz = 1000d * bruttoDoublePalacz;
        double nettoTysiacDoublePalacz = bruttoTysiacDoublePalacz / vatDoublePalacz;

        System.out.println("W double:");
        System.out.println("Cena netto produktu double: " + nettoDoublePalacz);
        System.out.println("Cena brutto produktu double: " + bruttoDoublePalacz);
        System.out.println("Cena brutto 1000 egzemplaży double: " + bruttoTysiacDoublePalacz);
        System.out.println("Cena nettu 1000 egzemplaży double: " + nettoTysiacDoublePalacz);

        BigDecimal nettoBigDecimalPalacz = new BigDecimal(9.99);
        BigDecimal vatBigDecimalPalacz = new BigDecimal(1.23);
        BigDecimal bruttoBigDecimalPalacz = nettoBigDecimalPalacz.multiply(vatBigDecimalPalacz);
        BigDecimal bruttoTysiacBigDecimalPalacz = bruttoBigDecimalPalacz.multiply(new BigDecimal(1000));
        BigDecimal nettoTysiacBigDecimalPalacz = bruttoTysiacBigDecimalPalacz.divide(vatBigDecimalPalacz);

        System.out.println("W BugDecimal:");
        System.out.println("Cena netto produktu double: " + nettoBigDecimalPalacz);
        System.out.println("Cena brutto produktu double: " + bruttoBigDecimalPalacz);
        System.out.println("Cena brutto 1000 egzemplaży double: " + bruttoTysiacBigDecimalPalacz);
        System.out.println("Cena nettu 1000 egzemplaży double: " + nettoTysiacBigDecimalPalacz);
    }
}
