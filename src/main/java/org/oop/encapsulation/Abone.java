package org.oop.encapsulation;

public class Abone {

    public String isim;
    public int bakiye;
    public String sehir;

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
