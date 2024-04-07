import geometry.Circle;
import geometry.Point;
import geometry.ColoredCircle;

public class Main {
    public static void main(String[] args) {
        // Tworzenie obiektu klasy Point i inicjacja wartościami
        Point point = new Point(3.5, 2.0);

        // Pobieranie i wyświetlanie współrzędnych punktu
        double x = point.getX();
        double y = point.getY();

        System.out.println("wspolrzedne punktu:");
        System.out.println("x = " + x);
        System.out.println("y = " + y);

        // Zmiana współrzędnych punktu
        point.setX(5.0);
        point.setY(4.2);

        // Ponowne pobranie i wyświetlenie nowych współrzędnych punktu
        x = point.getX();
        y = point.getY();

        System.out.println("\nNowe wspolrzedne punktu:");
        System.out.println("x = " + x);
        System.out.println("y = " + y);


        /* Wyświetlenie właściwości klasy Circle */
            // Tworzenie obiektu klasy Point (środek koła)
            Point center = new Point(3.0, 4.0);

            // Tworzenie obiektu klasy Circle
            Circle circle = new Circle(center, 5.0);

            // Wyświetlanie właściwości koła
            System.out.println("\n\nWlasciwosci kola:");
            System.out.println("Srodek kola: (" + circle.getCenter().getX() + ", " + circle.getCenter().getY() + ")");
            System.out.println("Promien kola: " + circle.getRadius());
            System.out.println("Obwod kola: " + circle.calculatePerimeter());
            System.out.println("Pole powierzchni kola: " + circle.getArea());

        /* Wyświetlenie właściwości klasy Circle */
            // Tworzenie obiektu klasy ColoredCircle
            ColoredCircle coloredCircle = new ColoredCircle(center, 5.0, "red");

            // Wyświetlanie właściwości koła
            System.out.println("\n\nWlasciwosci kolorowego kola:");
            System.out.println("Srodek kola: (" + coloredCircle.getCenter().getX() + ", " + coloredCircle.getCenter().getY() + ")");
            System.out.println("Promien kola: " + coloredCircle.getRadius());
            System.out.println("Obwod kola: " + coloredCircle.calculatePerimeter());
            System.out.println("Kolor kola: " + coloredCircle.getColor());
            System.out.println("Pole powierzchni kola: " + coloredCircle.getArea());
    }
}