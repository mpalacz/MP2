package Ćwiczenia2;

public class Zadanie2 {
    public static void main(String[] args) {
        float earthWeightPalacz;
        float marsWeightPalacz;
        float marsGravityPalacz;
        double marsWeightDoublePalacz;
        int marsWeightIntPalacz;

        earthWeightPalacz = 72.85f;
        marsGravityPalacz = 0.38f;
        marsWeightPalacz = earthWeightPalacz * marsGravityPalacz;
        System.out.println(marsWeightPalacz);

        marsWeightDoublePalacz = marsWeightPalacz;
        System.out.println(marsWeightDoublePalacz);

        marsWeightIntPalacz = (int)marsWeightDoublePalacz;
    }
}
