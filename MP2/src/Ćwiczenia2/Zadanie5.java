package Ćwiczenia2;

import java.math.BigDecimal;
import java.sql.SQLOutput;

public class Zadanie5 {
    public static void main(String[] args) {
        double nettoDoublePalacz = 9.99;
        double vatDoublePalacz = 1.23;
        double bruttoDoublePalacz = nettoDoublePalacz + nettoDoublePalacz * vatDoublePalacz;
        double bruttoTysiacDoublePalacz = 1000 * bruttoDoublePalacz;
        double nettoTysiacDoublePalacz = bruttoTysiacDoublePalacz - (bruttoTysiacDoublePalacz - nettoDoublePalacz * 1000);

        System.out.println("Cena netto produktu double: " + nettoDoublePalacz);
        System.out.println("Cena brutto produktu double: " + bruttoDoublePalacz);
        System.out.println("Cena brutto 1000 egzemplaży double: " + bruttoTysiacDoublePalacz);
        System.out.println("Cena nettu 1000 egzemplaży double: " + nettoTysiacDoublePalacz);
        System.out.println(nettoDoublePalacz * 1000);

        //BigDecimal nettoBigDecimalPalacz = 9.99;
    }
}
