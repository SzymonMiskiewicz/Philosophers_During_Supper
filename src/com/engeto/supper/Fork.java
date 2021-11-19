package com.engeto.supper;


import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

public class Fork {
    private String numberOfFork= "";
    ReentrantLock lock = new ReentrantLock(true);


    public Fork(String numberOfFork){
        this.numberOfFork = numberOfFork;
    }

    public String getNumberOfFork(){
        return numberOfFork;
    }

    public boolean pickUp() throws InterruptedException {
        if (lock.tryLock(10, TimeUnit.MILLISECONDS)){
            return true;
        }else {
            return false;
        }

        }

    public void putDown(){
        if (lock.isHeldByCurrentThread());
        lock.unlock();
    }






}
