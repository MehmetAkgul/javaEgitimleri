package org.exception.TryCatchBloklari;

public class Main {
    public static void main(String[] args) {
        //   int a = 20 / 0;   //ArithmeticException: / by zero

        // int[] ab = {1, 2, 3, 4, 5, 6};
        //System.out.println(ab[7]);   ///ArrayIndexOutOfBoundsException: Index 7 out of bounds for length 6

        try {

            int a = 20 / 0;
        } catch (Exception e) {

            if (e.getClass().getSimpleName().equals("ArithmeticException")) System.out.println("Bir sayi 0'a bolunemez");
        }


        try {
            int[] ab = {1, 2, 3, 4, 5, 6};
            System.out.println(ab[7]);
        } catch (Exception e) {

            if (e.getClass().getSimpleName().equals("ArrayIndexOutOfBoundsException")) System.out.println("Arrayin Boyunu astiniz");
        }


        try {
            int[] ab = {1, 2, 3, 4, 5, 6};
            System.out.println(ab[7]);

        } catch (Exception e) {
            e.printStackTrace();
        }


        try {
            int[] ab = {1, 2, 3, 4, 5, 6};
            System.out.println(ab[7]);
            int a = 20 / 0;

        } catch (Exception e) {
            System.out.println("Bir hata olustu");
            e.printStackTrace();
        }
    }
}
