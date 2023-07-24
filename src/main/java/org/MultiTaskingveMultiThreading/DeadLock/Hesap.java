package org.MultiTaskingveMultiThreading.DeadLock;

public class Hesap {
    private int bakiye = 10000;

    private void paraCek(int miktar) {
        bakiye -= miktar;
    }

    private void paraYatir(int miktar) {
        bakiye += miktar;
    }

    public static void paraTransferi(Hesap hesap1, Hesap hesap2, int miktar) {
        hesap1.paraCek(miktar);
        hesap2.paraYatir(miktar);
    }

    public int getBakiye() {
        return bakiye;
    }

    public void setBakiye(int bakiye) {
        this.bakiye = bakiye;
    }
}
