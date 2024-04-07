package geometry;

public class Point {
    private double x;
    private double y;

    // Konstruktor inicjujący pola x i y
    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    // Metoda zwracająca wartość pola x
    public double getX() {
        return x;
    }

    // Metoda zwracająca wartość pola y
    public double getY() {
        return y;
    }

    // Metoda ustawiająca wartość pola x
    public void setX(double x) {
        this.x = x;
    }

    // Metoda ustawiająca wartość pola y
    public void setY(double y) {
        this.y = y;
    }
}