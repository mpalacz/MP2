package Ćwiczenia2;

public class Zadanie4 {
    public static void main(String[] args) {
        int amountOfBricksPalacz = 0; //nieparzyste
        while(amountOfBricksPalacz % 2 == 0 || amountOfBricksPalacz == 0)
            amountOfBricksPalacz = (int)(Math.random() * (100 - 50));
        System.out.println("Ilość klocków: " + amountOfBricksPalacz);

        int containerCapacityPalacz = 1; //parzyste
        while(containerCapacityPalacz % 2 == 1 || containerCapacityPalacz == 0)
            containerCapacityPalacz = (int)(Math.random() * (10 - 5));
        System.out.println("Pojemność pojemnika: " + containerCapacityPalacz);

        System.out.println("Klocki w pełni zapelnią " + (amountOfBricksPalacz / containerCapacityPalacz) + " pojemników.");

        int bricksModuloPalacz = amountOfBricksPalacz % containerCapacityPalacz;

        if(bricksModuloPalacz != 0)
            System.out.println("W nie zapełnionym pojemniku znajdzie się " + bricksModuloPalacz + " klocków.");
    }
}
