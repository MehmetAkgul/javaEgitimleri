package org.accessModifiers.sinifDuzeyindeErisimBelirleyiciler.paket1;

import org.accessModifiers.sinifDuzeyindeErisimBelirleyiciler.paket2.*;

public class Main {
    // public ve default
    // public paket disindan erisilebilir
    // default sadace paket icinden ulasilabilir
    public static void main(String[] args) {
        PublicAraba publicAraba = new PublicAraba();
        //DefaultAraba defaultAraba = new DefaultAraba(); farkli paketten erisemezsin
    }
}
