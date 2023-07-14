package org.OzelliklerinKapsami;

public class Kapsam {
    private int privateDegisken = 30;

    public void onIleCarp() {
        int privateDegisken = 10;
        for (int i = 1; i < 6; i++) {
            System.out.println(i + "*" + privateDegisken + " = " + (i * privateDegisken));
        }
    }

    public Kapsam() {
        System.out.println("privateDegisken = " + privateDegisken);
    }
}
