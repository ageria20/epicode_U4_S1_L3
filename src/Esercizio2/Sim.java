package Esercizio2;

import java.util.Arrays;

public class Sim {

    private String cellNum;
    private int credit;
    private Call[] call;

    // Costruttore
    public Sim(String cellNum) {
        this.cellNum = cellNum;
        this.credit = 0;
        this.call = new Call[5];
    }

    public void getData() {
        System.out.println("Il numero di telefono e': " + this.cellNum);
        System.out.println("Il credito e': " + this.credit + "€");
        System.out.println("Le ultime chiamate sono': " + Arrays.toString(this.call));
        if (call.length > 0) {
            for (int i = 0; i < call.length; i++) {
                System.out.println(call[i]);
            }
        } else System.out.println("Non ci sono chiamate precendenti");

    }

}
