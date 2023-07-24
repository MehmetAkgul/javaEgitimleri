package org.MultiTaskingveMultiThreading.Thread.ThreadOlusturmak_ExtendThread_ile;

public class Main {
    public static void main(String[] args) {
        Thread printer1 = new Thread(new Printer("Printer1"));
        Thread printer2 = new Thread(new Printer("Printer2"));

        printer1.start();//2. thread
        printer2.start();//3. thread


        System.out.println("Main thread calisiyor...");//1. thread


    }
}
