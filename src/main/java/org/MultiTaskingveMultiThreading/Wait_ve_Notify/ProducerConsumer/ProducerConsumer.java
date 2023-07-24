package org.MultiTaskingveMultiThreading.Wait_ve_Notify.ProducerConsumer;


import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

public class ProducerConsumer {
    Random random = new Random();
    Object lock = new Object();
    Queue<Integer> queue = new LinkedList<>();

    private int limit = 10;


    public void produce() {
        while (true) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);

            }
            synchronized (lock) {
                if (queue.size() == limit) {
                    try {
                        lock.wait();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
                Integer value = random.nextInt(100);
                queue.offer(value);
                System.out.println("Producer Uretiyor : " + value);

                lock.notify();

            }
        }
    }

    public void consume() {
        while (true) {
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);

            }
            synchronized (lock) {
                if (queue.size() == 0) {
                    try {
                        lock.wait();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
                Integer value = queue.poll();
                System.out.println("Consumer Tuketiyor : " + value);
                System.out.println("Queue Size : " + queue.size());

                lock.notify();

            }
        }
    }

}
