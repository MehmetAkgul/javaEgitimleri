package org.accessModifiers.methodVeOzellikDuzeyindeErisimBelirleyiciler.baskaPaket;

import org.accessModifiers.methodVeOzellikDuzeyindeErisimBelirleyiciler.anaPaket.Hayvan;

public class At extends Hayvan {
    public At(String isim) {
        super(isim);
    }

    public void isminiSoyle() {
        System.out.println("Benim ismim :" + isim);// extendes oldugunda dolayi farkli pakette oldugumzuda protected olan erisim belirliyecilire ulasabiliriz

    }
}
