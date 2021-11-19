package com.engeto.supper;

public class Philosopher extends Thread{
    private String name;
    private Fork leftHand;
    private Fork rightHand;
    private Integer portionsEaten;
    private static final Integer PREPARED_PORTIONS = 10000;

    public Philosopher(String name, Fork leftHand, Fork rightHand){
        this.name = name;
        this.leftHand = leftHand;
        this.rightHand = rightHand;
        this.portionsEaten = 0;
    }

    @Override
    public void run() {

        while (portionsEaten.compareTo(PREPARED_PORTIONS) != 0) {
            try {
                if (leftHand.pickUp()){
                }
                if (rightHand.pickUp()){

                if (portionsEaten%100==0){

                    System.out.println(
                            name + " has taken " + leftHand.getNumberOfFork()
                                    + " in his left hand and "
                                    + rightHand.getNumberOfFork()
                                    + " in his right hand during: (" + this.portionsEaten + " portion)");}
                this.portionsEaten++;
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                leftHand.putDown();
                rightHand.putDown();

            }
        }
    }
}

