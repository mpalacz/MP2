package Ćwiczenia2;

public class Zadanie2 {
    public static void main(String[] args) {
        float earthWeightPalacz;
        float marsWeightPalacz;
        float marsGravityPalacz;
        double marsWeightDoublePalacz;
        int marsWeightIntPalacz;
        char marsWeightCharPalacz;
        int rowanieCharPalacz;

        earthWeightPalacz = 72.85f;
        marsGravityPalacz = 0.38f;
        marsWeightPalacz = earthWeightPalacz * marsGravityPalacz;
        System.out.println(marsWeightPalacz);

        marsWeightDoublePalacz = marsWeightPalacz;
        System.out.printf("%.4f %n" ,marsWeightDoublePalacz);

        marsWeightIntPalacz = (int)marsWeightDoublePalacz;
        System.out.println(marsWeightIntPalacz);

        marsWeightCharPalacz = (char)marsWeightIntPalacz;
        System.out.println(marsWeightCharPalacz);

        rowanieCharPalacz = marsWeightCharPalacz + marsWeightCharPalacz;
        System.out.println(rowanieCharPalacz);
    }
}
