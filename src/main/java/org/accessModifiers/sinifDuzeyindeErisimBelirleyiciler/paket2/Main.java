package org.accessModifiers.sinifDuzeyindeErisimBelirleyiciler.paket2;

public class Main {
    // public ve default
    // public paket disindan erisilebilir
    // default sadace paket icinden ulasilabilir
    public static void main(String[] args) {
        DefaultAraba defaultAraba = new DefaultAraba();
        PublicAraba publicAraba = new PublicAraba();
    }
}
