package org.variables;

public class TamsayiVeritipleri {

    public static void main(StringVariable[] args) {
        int a = 4; // -2ˆ31 ile 2ˆ31-1 arasindaki degerleri tutar aklinda
        System.out.println(Integer.MAX_VALUE);//2147483647
        System.out.println(Integer.MIN_VALUE);//-2147483648

        byte b = 3;// -128 ile 127 arasindaki degerler

        short c = 4; // -32768 ile 32767 arasindaki degerler

        long d = 5; // -9223372036854775807 ile 9223372036854775808 arasindaki deger

        System.out.println(Long.MAX_VALUE);//9223372036854775807
        System.out.println(Long.MIN_VALUE);//-9223372036854775808


        /***
         * VERI TIPLERININ BIRBIRINE DONUSTURULMESI
         *
         * kucukten buyuge otoamtik donusturme yapiyor
         * ama buyukten kucuge otoamtik donusturme yapmiyor siz bunu manuel yapiyorsunuz
         */

        //  byte ---> short ---> int ---> long

        byte e = 100;
        byte f = 2;
        byte g = (byte) (e / f); // burada parantez sonucu varsayilan olarak int olacagidan byte cascade ediyoruz


        short h = 100;
        byte i = 2;
        int j = 4;
        long l = h + i + j; // soldan saga dogru giderek donusturme yapiyormus h ve i yi topluyor int'e donusturuyor sonra j ile toplayip int'e donusturuyor sonra sonucu long a ceviriyor


    }
}
