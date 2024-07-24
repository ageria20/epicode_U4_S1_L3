package Esercizio3;

import java.util.Random;

public class Articolo {

    private int codArticle;
    private String description;
    private double price;
    private int pieces;

    public Articolo() {
        Random random = new Random();
        this.codArticle = random.nextInt(1, 100);
        this.description = "";
        this.price = 0;
        this.pieces = 0;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setPieces(int pieces) {
        this.pieces = pieces;
    }
}
