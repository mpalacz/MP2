package Ćwiczenia2;

public class Zadanie4 {
    public static void main(String[] args) {
        int amountOfBricksPalacz = 1; //nieparzyste

        int containerCapacityPalacz = 0; //parzyste

        System.out.println("Klocki w pełni zapelnią " + (amountOfBricksPalacz / containerCapacityPalacz) + " pojemników.");

        int bricksModuloPalacz = amountOfBricksPalacz % containerCapacityPalacz;

        if(bricksModuloPalacz != 0)
            System.out.println("W nie zapełnionym pojemniku znajdzie się " + bricksModuloPalacz + " klocków.");
    }
    //zrobić z random
}
