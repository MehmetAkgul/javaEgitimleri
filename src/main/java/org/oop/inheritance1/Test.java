package org.oop.inheritance1;

public class Test {
    public static void main(String[] args) {
        // IS-A  EMPLOYEE IS A PERSON

        Yonetici yonetici1 = new Yonetici("Mehmet Akgul", 850, "IT",10);
        yonetici1.zamYap(200);
        yonetici1.bilgileriGoster();
    }
}
