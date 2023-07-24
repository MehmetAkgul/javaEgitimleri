package org.MultiTaskingveMultiThreading.ThreadHavuzlari_ExecuterService;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) {


        ExecutorService executorService = Executors.newFixedThreadPool(2);

        for (int i = 1; i <= 5; i++) {
            executorService.submit(new Worker(String.valueOf(i), i));
        }

        executorService.shutdown();
        try {
            executorService.awaitTermination(1, TimeUnit.DAYS);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


       /* Thread t1 = new Thread(new Worker("1", 1));
        Thread t2 = new Thread(new Worker("2", 2));
        Thread t3 = new Thread(new Worker("3", 3));
        Thread t4 = new Thread(new Worker("4", 4));
        Thread t5 = new Thread(new Worker("5", 5));
        System.out.println("Butun isler teslim edildi ");

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.getMessage();
        }

        t3.start();
        t4.start();

        try {
            t3.join();
            t4.join();
        } catch (InterruptedException e) {
            e.getMessage();
        }
        t5.start();

        try {
            t5.join();

        } catch (InterruptedException e) {
            e.getMessage();
        }

        System.out.println("butun isler tamamlandi");

        */
    }
}
