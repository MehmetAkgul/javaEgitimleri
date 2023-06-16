package org.oop.encapsulation;

public class GelismisAbone {

    private String isim;
    private int bakiye = 120;
    private String sehir;

    public GelismisAbone(String isim, int bakiye, String sehir) {
        this.isim = isim;
        if (bakiye >= 0 && bakiye <= 120) this.bakiye = bakiye;
        this.sehir = sehir;
    }


    public void dogalgazKullan(int miktar) {
        if ((bakiye - miktar) < 0) {
            System.out.println("Yetersiz bakiye...");
        } else {
            bakiye -= miktar;
            if (bakiye < 0) {
                System.out.println("Bakiyeniz bitmistir... Lutfen kredi yukleyin" +
                        "Kredi Limiti 120 TL ");
            } else {
                System.out.println("Yeni bakiye :" + bakiye);
            }
        }
    }

    public void bakiyeOgren() {
        System.out.println("Bakiyeniz : " + bakiye);
    }
}
