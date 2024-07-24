package Esercizio2;

import java.util.Random;

public class Call {

    private int minutes;
    private String calledNumber;

    public Call(String calledNumber, int minutes) {
        Random random = new Random();
        this.minutes = minutes;
        this.calledNumber = calledNumber;
    }

    @Override
    public String toString() {
        return "Call: {" +
                " minutes = " + minutes +
                ", calledNumber = " + calledNumber + '\'' +
                '}';
    }
}
