public class Polygon {
    private Point[] punkty;

    public Polygon(Point[] punkty) {
        this.punkty = new Point[punkty.length];
        for (int i = 0; i < punkty.length; i++) {
            this.punkty[i] = new Point(punkty[i]);
        }
    }

    public Polygon(Polygon inny) {
        this(inny.punkty);
    }

    public String toString() {
        String wynik = "Polygon: ";
        for (Point p : punkty) {
            wynik += p + " ";
        }
        return wynik;
    }

    public String toSvg() {
        String wynik = "<polygon points=\"";
        for (Point p : punkty) {
            wynik += p.getX() + "," + p.getY() + " ";
        }
        wynik += "\" fill=\"none\" stroke=\"black\" />";
        return wynik;
    }
}