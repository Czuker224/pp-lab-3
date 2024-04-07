import geometry.Circle;
import geometry.Point;
import geometry.ColoredCircle;
import java.util.Random;
import geometry.Rectangle;

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


        // Tworzenie tablicy obiektów Circle i ColoredCircle
        Circle[] circles = new Circle[10]; // rozmiaru tablicy = 10 elementów

        // Uzupełnienie tablicy kolejnymi obiektami Circle
        int i;
        for (i = 0; i < 6; i++) {
            circles[i] = new Circle(new Point(i, i + 1), i + 2);
        }
        // Uzupełnienie tablicy kolejnymi obiektami ColoredCircle
        for (i = 6; i < 10; i++) {
            circles[i] = new ColoredCircle(new Point(i, i + 1), i + 2, "green");
        }

        //wyświetlanie danych z tablicy circles
        System.out.println();
        for (i = 0; i < circles.length; i++) {
            if (circles[i] != null) { // Sprawdzenie czy element tablicy nie jest pusty
                String msg = "Obszar kola " + (i + 1) + ": " + circles[i].getArea();
                // Sprawdzenie czy obiekt jest instancją ColoredCircle
                if (circles[i] instanceof ColoredCircle) {
                    ColoredCircle coloredCircleFromArray = (ColoredCircle) circles[i];
                    msg = msg + " ( Kolor: " + coloredCircleFromArray.getColor() + " )";
                }
                System.out.println(msg);
            }
        }

        // Tworzenie obiektu klasy Rectangle
        Rectangle rectangle = new Rectangle(5.0, 3.0);

        // Wyświetlanie właściwości prostokąta
        System.out.println();
        System.out.println("Pole prostokata: " + rectangle.calculateArea());
        System.out.println("Obwod prostokata: " + rectangle.calculatePerimeter());




    }

}