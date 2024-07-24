package Esercizio1;

public class Rectangle {

    private double height;
    private double width;

    public Rectangle(double height, double width) {
        this.height = height;
        this.width = width;
    }

    public static void printTwoRect(Rectangle rect1, Rectangle rect2) {
        double p1 = rect1.getPerimeter();
        double a1 = rect1.getArea();
        double p2 = rect1.getPerimeter();
        double a2 = rect1.getArea();
        double sumPerimeter = p1 + p2;
        double sumAreas = a1 + a2;
        System.out.println("rect1 = " + rect1 + ", rect2 = " + rect2);

    }

    public double getPerimeter() {
        return (width + height) * 2;
    }

    public double getArea() {
        return width * height;
    }

    public void printRectangle() {
        double p = getPerimeter();
        double area = getArea();
        System.out.println("Il perimentro del Rettangolo e': " + p + " " + "L'area del Rettangolo e': " + area);
    }

}
