package Ćwiczenia2;

public class Zadanie4 {
    public static void main(String[] args) {
        int amountOfBricksPalacz = 61;
        int containerCapacityPalacz = 6;

        System.out.println("Klocki w pełni zapelnią " + (amountOfBricksPalacz / containerCapacityPalacz) + " pojemników.");

        int bricksModuloPalacz = amountOfBricksPalacz % containerCapacityPalacz;

        if(bricksModuloPalacz != 0)
            System.out.println("W nie zapełnionym pojemniku znajdzie się " + bricksModuloPalacz + " klocków.");
    }
}
