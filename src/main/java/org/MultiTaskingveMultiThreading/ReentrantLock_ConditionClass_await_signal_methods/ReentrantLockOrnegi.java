package org.MultiTaskingveMultiThreading.ReentrantLock_ConditionClass_await_signal_methods;

import java.util.Scanner;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ReentrantLockOrnegi {

    private int say = 0;
    private Lock lock = new ReentrantLock();

    private Condition condition = lock.newCondition();


    public void arrttir() {
        for (int i = 0; i < 10000; i++) {
            say++;
        }
    }

    public void thread1Fonksiyonu() {
        lock.lock();

        System.out.println("Thread 1 uyandirilmayi bekliyor....");

        try {
            condition.await();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Thread 1 uyandirildi  ve Islemine devam ediyor");
        arrttir();

        lock.unlock();


    }

    public void thread2Fonksiyonu() {

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        Scanner scanner = new Scanner(System.in);

        lock.lock();
        System.out.println("Thread 2 calisiyor...");
        arrttir();
        System.out.println("Devam etmek icin bir tusa basiniz ");

        scanner.nextLine();
        condition.signal();
        System.out.println("Thread 1'i uyandirdim. Bend gidiyorum ");

        lock.unlock();

    }

    public void threadOver() {
        System.out.println("say degiskeninin degeri:" + say);
    }
}
