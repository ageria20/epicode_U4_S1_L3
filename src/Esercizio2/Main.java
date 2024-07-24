package Esercizio2;

public class Main {
    public static void main(String[] args) {
        Sim sim1 = new Sim("3401600696");
        Call call1 = new Call("3401600696", 5);
        Call call2 = new Call("3401600696", 5);
        Call call3 = new Call("3401600696", 5);
        Call call4 = new Call("3401600696", 5);
//        Call call5 = new Call("3401600696", 5);
        Call[] calls = {call1, call2, call3, call4};
        sim1.setCall(calls);
        sim1.getData();
    }
}
