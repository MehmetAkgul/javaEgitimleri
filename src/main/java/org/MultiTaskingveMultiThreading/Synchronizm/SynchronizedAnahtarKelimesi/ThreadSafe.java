package org.MultiTaskingveMultiThreading.Synchronizm.SynchronizedAnahtarKelimesi;

public class ThreadSafe {
    private int count = 0;

    public synchronized void arttir(){
        count++;
    }

    public void threadlariCalistir() {
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 5000; i++) {
                    arttir();
                }
            }
        });
        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 5000; i++) {
                    arttir();
                }
            }
        });
        thread1.start();
        thread2.start();
        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            System.out.println("");
        }

        System.out.println("Count degiskeninin degeri: " + count);
    }


    public static void main(String[] args) {
        ThreadSafe threadSafe = new ThreadSafe();
        threadSafe.threadlariCalistir();

    }
}
