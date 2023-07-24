package org.MultiTaskingveMultiThreading.ProcuderConsumerProblemi_ArrayBlockingQueue_ile_cozmek;

import java.util.Random;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class ProducerConsumer {

    Random random = new Random();
    BlockingQueue<Integer> blockingQueue = new ArrayBlockingQueue<>(10);

    public void produce() {
        while (true) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }


            try {
                Integer value = random.nextInt(100);
                blockingQueue.put(value);
                System.out.println("Producer uretiyor :" + value);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }


        }
    }

    public void cosume() {
        while (true) {
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }


            try {
                Integer value = blockingQueue.take();
                System.out.println("Consumer tuketiyor :" + value);

                System.out.println(blockingQueue.size());
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }


        }
    }

}
