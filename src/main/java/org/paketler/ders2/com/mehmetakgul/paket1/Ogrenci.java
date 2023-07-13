package org.paketler.ders2.com.mehmetakgul.paket1;

import org.paketler.ders2.com.mehmetakgul.paket2.IAdayOgrenci;

public class Ogrenci implements IAdayOgrenci {
    @Override
    public void dersCalis() {
        System.out.println("Ders Calisiyorum");
    }
}
