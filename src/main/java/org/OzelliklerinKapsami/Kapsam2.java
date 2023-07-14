package org.OzelliklerinKapsami;

public class Kapsam2 {
    private int privateDegisken = 30;


    public void dahiliSinifKontrol() {
        DahiliSinif dahiliSinif = new DahiliSinif();
        System.out.println("kontrol ediliyor" + dahiliSinif.a);
    }

    public class DahiliSinif {

        private int privateDegisken = 20;
        private int a = 3;

        public void onIleCarp() {
            int privateDegisken = 10;

            for (int i = 1; i < 6; i++) {
                System.out.println(i + "*" + privateDegisken + " = " + (i * privateDegisken));
                System.out.println(i + "*" + this.privateDegisken + " = " + (i * this.privateDegisken));
                System.out.println(i + "*" + Kapsam2.this.privateDegisken + " = " + (i * Kapsam2.this.privateDegisken));
            }
        }
    }

    public Kapsam2() {
        System.out.println("privateDegisken = " + privateDegisken);
    }
}
