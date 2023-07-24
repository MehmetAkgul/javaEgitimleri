package org.MultiTaskingveMultiThreading.Wait_ve_Notify;

import java.util.Scanner;

public class WaitNotifay {

    private Object lock = new Object();

    public void thread1Fonksiyonu() {
        synchronized (lock) {
            System.out.println("Thread 1 Calisiyor");
            System.out.println("Thread 1 Thread 2'nin kendisini uyandirmasini bekliyor");

            try {
                lock.wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            System.out.println("Thread 1 uyandi devam ediyor");
        }
    }

    public void thread2Fonksiyonu() {

        Scanner scanner = new Scanner(System.in);
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        synchronized (lock) {
            System.out.println("Thread 2 Calisiyor  ");
            System.out.println("devam etmek icin bir tusa basin");

            scanner.nextLine();

            lock.notify();// wait() komutunu iptal eder
            System.out.println("Uyandirdim abi. Ben gidiyorum ama 2 saniye bekle... ");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
