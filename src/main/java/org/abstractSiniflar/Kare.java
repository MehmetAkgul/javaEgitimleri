package org.abstractSiniflar;

public class Kare extends Sekil {
    private int kenar;


    public Kare(String isim, int kenar) {
        super(isim);
        this.kenar = kenar;

    }

    @Override
    protected void alanHesapla() {
        System.out.println(getIsim() + " alani " + kenar * kenar);
    }

    public void cevreHersapla() {
        System.out.println(getIsim() + " cevresi " + kenar * 4);
    }
}
