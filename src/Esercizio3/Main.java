package Esercizio3;

public class Main {
    public static void main(String[] args) {

        Cliente user1 = new Cliente("Andrea", "Geria", "ageria@");
        Articolo article = new Articolo("phone", 25, 5);
        Articolo article2 = new Articolo("ipad", 50, 1);
        Articolo[] articles = {article, article2};
        Carrello cart = new Carrello(user1, articles);

        System.out.println(user1);
        System.out.println(article);
        System.out.println(cart);

    }
}
