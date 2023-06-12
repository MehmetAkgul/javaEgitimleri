package org.methodlar;

public class AsalSayilar {


    public static boolean asalMi(int sayi) {
        for (int i = 2; i < sayi; i++) {
            if (sayi % i == 0)
                return false;
        }
        return true;
    }



    public static void main(String[] args) {



int adet=0;
        for (int i = 2; i < 1000; i++) {
            if (asalMi(i)){
                System.out.println(i+ "sayisi asal bir sayidir ");
                adet++;
            }
        }
        System.out.println(1000  + "'e kadar olan sayilar icinde toplam "+ adet +" asal sayi vardir");
    }
}
