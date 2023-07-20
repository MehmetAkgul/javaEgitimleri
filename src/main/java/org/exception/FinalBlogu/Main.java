package org.exception.FinalBlogu;

public class Main {
    public static void main(String[] args) {
      /*  try {
            String s = null;
            System.out.println(s.hashCode());

        } catch (NullPointerException e) {
            System.out.println("Null referans hatasi ");
        } finally {
            System.out.println("Finally blogu calisti ");
        }
*/
      /*  try {
            String s = "mustafa";
            System.out.println(s.hashCode());

        } catch (NullPointerException e) {
            System.out.println("Null referans hatasi ");
        } finally {
            System.out.println("Finally blogu calisti ");
        }*/

        try {
           int a= 30/0;
            System.out.println("deneme");

        } catch (NullPointerException e) {
            System.out.println("Null referans hatasi ");
        } finally {
            System.out.println("Finally blogu calisti ");
        }// program hata verip dursa bile finally blogu calisir

    }
}
