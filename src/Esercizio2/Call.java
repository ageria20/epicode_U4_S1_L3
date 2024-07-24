package Esercizio2;

import java.util.Random;

public class Call {

    private int minutes;
    private String calledNumber;

    public Call(int calledNumber) {
        Random random = new Random();
        this.minutes = random.nextInt();
        this.calledNumber = Long.toString(calledNumber);
    }


}
