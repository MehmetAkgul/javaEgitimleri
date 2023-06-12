package org.methodlar;

public class ReturnKavrami {

    public static int toplam(int a, int b, int c) {
        return a+b+c;
    }

    public  static int ikiIleCarp(int a){
        return a*2;
    }

    public  static int ikiIleTopla(int a){
        return a+2;
    }

    public  static int dortIleCarp(int a){
        return a*4;
    }

    public static void main(String[] args) {

        System.out.println("Sonuc iki  "+ dortIleCarp(ikiIleTopla(ikiIleCarp(3))));

        System.out.println("Sonuc "+toplam(9,8,7));
    }
}
