package org.MultiTaskingveMultiThreading.ThreadHavuzlari_ExecuterService;

public class Worker implements Runnable {


    private String isim;
    private int taskid;

    public Worker(String isim, int taskid) {
        this.isim = isim;
        this.taskid = taskid;
    }

    @Override
    public void run() {
        try {

            System.out.println("Worker " + isim + " " + taskid + " nolu task ile ise basladi ");
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Worker " + isim + " " + taskid + " nolu taski bitirdi. ");


    }
}
