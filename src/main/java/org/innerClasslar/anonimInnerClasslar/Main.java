package org.innerClasslar.anonimInnerClasslar;

public class Main {
    public static void main(String[] args) {
        IOgrenci ogrenci = new IOgrenci() {
            @Override
            public void dersCalis() {
                System.out.println("ogrenci calisti");
            }

            @Override
            public void derseGir() {
                System.out.println("ogrenci derse girdi");

            }
        };

        Aogrenci ogrenci2 = new Aogrenci("Mehmet", 45) {
            @Override
            void kayitYaptir() {
                System.out.println("Kayit yapildi. Isim: " + getIsim() + " numara :" + getNumara());
            }


        };
        ogrenci.dersCalis();
        ogrenci.derseGir();
        ogrenci2.kayitYaptir();

    }

    public static abstract class Aogrenci {

        private String isim;
        private int numara;

        public Aogrenci(String isim, int numara) {
            this.isim = isim;
            this.numara = numara;
        }

        public String getIsim() {
            return isim;
        }

        public void setIsim(String isim) {
            this.isim = isim;
        }

        public int getNumara() {
            return numara;
        }

        public void setNumara(int numara) {
            this.numara = numara;
        }

        abstract void kayitYaptir();

        public void selamla() {
            System.out.println("Selamlar");
        }

    }

    public interface IOgrenci {
        void dersCalis();

        void derseGir();

    }


}
