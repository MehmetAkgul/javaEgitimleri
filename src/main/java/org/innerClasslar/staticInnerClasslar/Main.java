package org.innerClasslar.staticInnerClasslar;

public class Main {
    public static void main(String[] args) {

        Matematik.Alan alan = new Matematik.Alan();
        // alan.daireAlanHesapla(5);
        // eger method da static ise asagidaki sekilde kullanilabilir
        Matematik.Alan.daireAlanHesapla(5);


    }
}
