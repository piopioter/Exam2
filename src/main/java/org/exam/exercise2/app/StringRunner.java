package org.exam.exercise2.app;

public class StringRunner {
    public static void main(String[] args) {

        long start1 = System.nanoTime();
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < 30; i++) {
            stringBuilder.append("Ala");


        }
        String s1 = stringBuilder.toString();
        long stop1 = System.nanoTime();

        long start2 = System.nanoTime();
        String result = "";
        for (int i = 0; i < 30; i++) {
            result += "Ala";

        }
        long stop2 = System.nanoTime();

        long t1 = stop1 - start1;
        long t2 = stop2 - start2;

        System.out.println("Wydajność: " + (((double) t2) / t1));
        System.out.println("StringBuilder :" + t1);
        System.out.println("Concatenation :" + t2);

        //StringBuilder jest szybszy, gdyż jest modyfikowalny  jego obiekty  mogą rozszerzać swoją zawartość
        //(Wewnętrznie obiekty StringBuildera traktowane są jak tablice o zmiennej długości) dzięki temu nie generuje
        //niepotrzebnych obiektów tak jak to ma miejsce w konkatenacji stringów. Przez metodę append() dodajemy pewną
        // wartość do istniejącego ciągu.




        //StringBuilder będzie gorszy od konkatenacji Stringów w aplikacjach wielowątkowych.

    }
}
