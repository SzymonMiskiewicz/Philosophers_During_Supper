package com.engeto.supper;

public class Main {

    public static void main(String[] args) {

        Fork fork = new Fork("fork 1");
        Fork fork2 = new Fork("fork 2");
        Fork fork3 = new Fork("fork 3");
        Fork fork4 = new Fork("fork 4");
        Fork fork5 = new Fork("fork 5");
        Fork fork6 = new Fork("fork 6");
        Fork fork7 = new Fork("fork 7");
        Fork fork8 = new Fork("fork 8");
        Fork fork9 = new Fork("fork 9");
        Fork fork10 = new Fork("fork 10");

        Philosopher philosopher = new Philosopher("Philosopher ",fork,fork2);
        Philosopher philosopher2 = new Philosopher("Philosopher2 ",fork2,fork3);
        Philosopher philosopher3 = new Philosopher("Philosopher3 ",fork3,fork4);
        Philosopher philosopher4 = new Philosopher("Philosopher4 ",fork4,fork5);
        Philosopher philosopher5 = new Philosopher("Philosopher5 ",fork5,fork6);
        Philosopher philosopher6 = new Philosopher("Philosopher6 ",fork6,fork7);
        Philosopher philosopher7 = new Philosopher("Philosopher7 ",fork7,fork8);
        Philosopher philosopher8 = new Philosopher("Philosopher8 ",fork8,fork9);
        Philosopher philosopher9 = new Philosopher("Philosopher9 ",fork9,fork10);
        Philosopher philosopher10 = new Philosopher("Philosopher10 ",fork10,fork);

        philosopher.start();
        philosopher2.start();
        philosopher3.start();
        philosopher4.start();
        philosopher5.start();
        philosopher6.start();
        philosopher7.start();
        philosopher8.start();
        philosopher9.start();
        philosopher10.start();


    }
}
