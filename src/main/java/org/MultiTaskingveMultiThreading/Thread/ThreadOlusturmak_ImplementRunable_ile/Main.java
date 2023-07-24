package org.MultiTaskingveMultiThreading.Thread.ThreadOlusturmak_ImplementRunable_ile;

public class Main {
    public static void main(String[] args) {
        Printer printer1 = new Printer("Printer1");
        Printer printer2 = new Printer("Printer2");

        printer1.start();//2. thread
        printer2.start();//3. thread


        System.out.println("Main thread calisiyor...");//1. thread


    }
}
