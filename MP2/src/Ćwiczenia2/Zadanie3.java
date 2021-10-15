package Ćwiczenia2;

import java.util.Random;

public class Zadanie3 {
    public static void main(String[] args) {
        int randomNumberPalacz = (int)(Math.random() * (100 - 1));
        System.out.println("Genereowanie losowej liczby w przedziale od 1 do 100...\nWygenerowana liczba: " + randomNumberPalacz);

        if (randomNumberPalacz % 2 == 0)
            System.out.println("Liczba jest parzysta!");
        else
            System.out.println("Liczba nie jest parzysta!");
    }
}
