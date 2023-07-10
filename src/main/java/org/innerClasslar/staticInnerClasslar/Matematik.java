package org.innerClasslar.staticInnerClasslar;

public class Matematik {
    private static double PI = Math.PI;

    public static class Alan {
        public static void daireAlanHesapla(int yaricap) {
            //System.out.println(" Dairenin alani :" + (yaricap * yaricap * Math.PI));
            System.out.println(" Dairenin alani :" + (yaricap * yaricap * PI));
        }
    }
}
