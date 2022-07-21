package com.engeto.supper;

public class Main {

    public static void main(String[] args) {

        Philosopher[] philosophers = new Philosopher[10];
        Object[] forks = new Object [philosophers.length];

        for (int i =0;i<forks.length;i++) {

            forks[i] = new Object();
        }

        for (int j = 0;j< philosophers.length;j++) {

            Object leftFork = forks[j];

            Object rightFork = forks[(j+1) % forks.length];

            if (j == 0){

                philosophers[j] = new Philosopher(rightFork, leftFork);
            }
            else {

            philosophers[j] = new Philosopher(leftFork, rightFork);}

        Thread thread = new Thread(philosophers[j], "Philosopher "+(j+1));

        thread.start();

        }

    }
}
