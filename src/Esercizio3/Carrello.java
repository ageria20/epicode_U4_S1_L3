package Esercizio3;

import java.util.Arrays;

public class Carrello {

    private Cliente user;
    private Articolo[] articles;
    private double total;

    public Carrello(Cliente user, Articolo[] articles) {
        this.user = user;
        this.articles = articles;
        this.total = totalPrices(articles);
    }

    public double totalPrices(Articolo[] articles) {
        double total = 0;
        for (int i = 0; i < articles.length; i++) {
            total += articles[i].getPrice();
        }
        return total;
    }

    @Override
    public String toString() {
        return "Carrello{" +
                "user=" + user +
                ", articles=" + Arrays.toString(articles) +
                ", total=" + total +
                '}';
    }
}
