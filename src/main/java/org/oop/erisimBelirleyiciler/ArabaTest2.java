package org.oop.erisimBelirleyiciler;

public class ArabaTest2 {

    public static void main(String[] args) {

        Araba2 araba2 = new Araba2();

        araba2.setModel("Renault");
        araba2.setKapilar(-2);

        System.out.println("Arabanin modeli : "+ araba2.getModel());
        System.out.println("Arabanin kapis sayisi : "+ araba2.getKapilar());

    }
}
