package Esercizio2;

public class Sim {

    private String cellNum;
    private int credit;
    private Call[] calls;

    // Costruttore
    public Sim(String cellNum) {
        this.cellNum = cellNum;
        this.credit = 0;
        this.calls = new Call[5];
    }

    public void getData() {
        System.out.println("Il numero di telefono e': " + this.cellNum);
        System.out.println("Il credito e': " + this.credit + "€");
        if (calls.length > 0) {
            for (int i = 0; i < calls.length; i++) {
                if (calls[i] != null) {
                    System.out.println(calls[i]);
                } else break;
            }
        } else System.out.println("Non ci sono chiamate precendenti");

    }

    public void setCall(Call[] calls) {
        this.calls = calls;
    }
}
