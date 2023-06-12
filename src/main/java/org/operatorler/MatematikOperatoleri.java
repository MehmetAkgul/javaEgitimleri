package org.operatorler;

public class MatematikOperatoleri {
    public static void main(String[] args) {
        /**
         * javada matematik operatorleri 5 tanedir
         * Toplama
         * Cikarma
         * Bolme
         * Carpma
         * Kalan
         */


        System.out.println(3 + 4.2);
        System.out.println(3 - 5f);
        System.out.println(10d / 4);
        System.out.println(10 / 4.0);
        System.out.println(3 * 4.5);

        System.out.println(10 % 4);


        System.out.println("----------------------------------------------------------------");


        int a = 4;
        System.out.println(a);
        a = a + 2;
        System.out.println(a);
        a += 2;
        System.out.println(a);
        a++;
        System.out.println(a);

        int b = 4;
        System.out.println(b);
        b = b - 2;
        System.out.println(b);
        b -= 2;
        System.out.println(b);
        b--;
        System.out.println(b);

        System.out.println("----------------------------------------------------------------");
        int x = 5;
        System.out.println(x++);// once yazdirdi sonra guncelledi postfix
        System.out.println(++x);// once guncelledi sonra yazdirdi prefix







    }
}
