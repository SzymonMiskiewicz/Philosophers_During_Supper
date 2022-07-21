package com.engeto.supper;

public class Philosopher implements Runnable {

    private final Object leftFork;
    private final Object rightFork;

    int foodCounter = 0;

    public Philosopher(Object leftFork, Object rightFork) {
        this.leftFork = leftFork;
        this.rightFork = rightFork;
    }

    private void doAction (String action) throws InterruptedException {

        System.out.println(Thread.currentThread().getName() + " "+ action);

        Thread.sleep((int) Math.random() * 100);
    }

    @Override
    public void run() {

        while(foodCounter< 10000) {

            try {
                
                doAction(System.nanoTime() + ": thinking");

                synchronized (leftFork) {

                    doAction(System.nanoTime()+": take left fork");

                    synchronized (rightFork) {

                        foodCounter++;

                        doAction(System.nanoTime()+": pick right fork and start eating "+foodCounter);

                        doAction(System.nanoTime()+": put down right fork");
                    }

                    doAction(System.nanoTime()+": Put down left fork and return to start thinking");
                }
            } catch (InterruptedException e) {

                e.printStackTrace();
            }

        }
    }

}








