package org.MultiTaskingveMultiThreading.Thread.ThreadOlusturmak_AnonimClass_ile;


public class Main {
    public static void main(String[] args) {


        Thread printer1 = new Thread(new Runnable() {
            @Override
            public void run() {

                System.out.println("Thread Calisiyor");
                for (int i = 0; i < 10; i++) {
                    System.out.println("Thread 1 yaziyor :" + i);
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        System.out.println("Thread Baslatilamadi");
                    }
                }
            }
        });
        printer1.start();


        new Thread(new Runnable() {
            @Override
            public void run() {

                System.out.println("Thread2 Calisiyor");
                for (int i = 0; i < 10; i++) {
                    System.out.println("Thread 2 yaziyor :" + i);
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        System.out.println("Thread2 Baslatilamadi");
                    }
                }
            }
        }).start();


        new Thread(() -> {

            System.out.println("Thread3 Calisiyor");
            for (int i = 0; i < 10; i++) {
                System.out.println("Thread 3 yaziyor :" + i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    System.out.println("Thread3 Baslatilamadi");
                }
            }
        }).start();




        System.out.println("Main Thread Calisiyor...");


    }
}
