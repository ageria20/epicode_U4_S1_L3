package Esercizio3;

import java.util.Random;

public class Articolo {

    private int codArticle;
    private String description;
    private double price;
    private int pieces;

    public Articolo(String description, double price, int pieces) {
        Random random = new Random();
        this.codArticle = random.nextInt(1, 100);
        this.description = description;
        this.price = price;
        this.pieces = pieces;
    }


    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Articolo: " +
                " codArticle = " + codArticle +
                ", description = '" + description + '\'' +
                ", price = " + price +
                ", piece = " + pieces
                ;
    }
}
