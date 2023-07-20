package org.exception.ExceptionPropagation;

public class Main {
    public static void ucuncuFonksiyon() {

        try {
            int a = 12 / 0;
        }catch (ArithmeticException e){

            System.out.println("deneme");
        }

    }

    public static void ikinciFonksiyon() {
        ucuncuFonksiyon();


    }

    public static void birinciFonksiyon() {
        ikinciFonksiyon();


    }

    public static void main(String[] args)   {
        birinciFonksiyon();
    }
}
