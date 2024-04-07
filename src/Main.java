public class Main {
    public static void main(String[] args) {
        // Tworzenie obiektu klasy Point i inicjacja wartościami
        Point point = new Point(3.5, 2.0);

        // Pobieranie i wyświetlanie współrzędnych punktu
        double x = point.getX();
        double y = point.getY();

        System.out.println("Współrzędne punktu:");
        System.out.println("x = " + x);
        System.out.println("y = " + y);

        // Zmiana współrzędnych punktu
        point.setX(5.0);
        point.setY(4.2);

        // Ponowne pobranie i wyświetlenie nowych współrzędnych punktu
        x = point.getX();
        y = point.getY();

        System.out.println("\nNowe współrzędne punktu:");
        System.out.println("x = " + x);
        System.out.println("y = " + y);
    }
}