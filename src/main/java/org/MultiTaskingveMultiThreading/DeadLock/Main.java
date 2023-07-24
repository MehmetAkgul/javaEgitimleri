package org.MultiTaskingveMultiThreading.DeadLock;

public class Main {
    public static void main(String[] args) {
        DeadLockOrnegi deadLockOrnegi = new DeadLockOrnegi();
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                deadLockOrnegi.thread1Fonksiyonu();
            }
        });
        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                deadLockOrnegi.thread2Fonksiyonu();
            }
        });

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }



        deadLockOrnegi.threadOver();
    }
}
