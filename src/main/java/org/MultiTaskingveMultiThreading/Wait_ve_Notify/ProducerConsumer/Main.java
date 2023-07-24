package org.MultiTaskingveMultiThreading.Wait_ve_Notify.ProducerConsumer;


/*
ArrayBlockingQueue
 */


public class Main {
    public static void main(String[] args) {
         ProducerConsumer producerConsumer = new ProducerConsumer();
        Thread producer = new Thread(new Runnable() {
            @Override
            public void run() {
                producerConsumer.produce();
            }
        });

        Thread cosumer = new Thread(new Runnable() {
            @Override
            public void run() {
                producerConsumer.consume();
            }
        });

        producer.start();
        cosumer.start();

        try{
            producer.join();
            cosumer.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }
}
