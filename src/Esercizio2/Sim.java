package Esercizio2;

import java.util.Arrays;

public class Sim {

    private int cellNum;
    private int credit;
    private Call call[];

    public Sim(int cellNum) {
        this.cellNum = cellNum;
        this.credit = 0;
        this.call = new Call[5];
    }

    public void getData() {
        System.out.println("Il numero di telefono e': " + this.cellNum);
        System.out.println("Il credito e': " + this.credit);
        System.out.println("Le ultime chiamate sono': " + Arrays.toString(this.call));

    }

}
