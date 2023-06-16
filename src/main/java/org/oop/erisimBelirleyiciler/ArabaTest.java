package org.oop.erisimBelirleyiciler;

public class ArabaTest {

    public static void main(String[] args) {

        Araba araba1 = new Araba();

        araba1.renk = "kirmizi ";
        araba1.kapilar = 4;
        araba1.tekerlekler = 4;
        araba1.motor = "16V";
        araba1.model = "Renault";

        System.out.println(araba1.model);


    }
}
