package Esercizio1;

import static Esercizio1.Rectangle.printTwoRect;

public class Main {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(5, 6);
        Rectangle rectangle2 = new Rectangle(10, 20);
        rectangle.printRectangle();
        printTwoRect(rectangle, rectangle2);
    }


}