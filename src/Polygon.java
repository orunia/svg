public class Polygon extends Shape {
    private Point[] punkty;

    public Polygon(Point[] punkty, Style styl) {
        super(styl == null ? new Style("none", "black", 1.0) : styl);
        this.punkty = new Point[punkty.length];
        for (int i = 0; i < punkty.length; i++) {
            this.punkty[i] = new Point(punkty[i]);
        }
    }

    public Polygon(Point[] punkty) {
        this(punkty, null);
    }

    public Polygon(Polygon inny) {
        this(inny.punkty, inny.styl);
    }

    public static Polygon square(Segment odcinek, Style styl) {
        Segment prostopadly = odcinek.perpendicular();

        Point a = odcinek.getPunkt1();
        Point c = odcinek.getPunkt2();
        Point b = prostopadly.getPunkt1();
        Point d = prostopadly.getPunkt2();

        return new Polygon(new Point[]{a, b, c, d}, styl);
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
        wynik += "\" " + styl.toSvg() + " />";
        return wynik;
    }

    public BoundingBox boundingBox() {
        double minX = punkty[0].getX();
        double maxX = punkty[0].getX();
        double minY = punkty[0].getY();
        double maxY = punkty[0].getY();

        for (Point p : punkty) {
            if (p.getX() < minX) {
                minX = p.getX();
            }
            if (p.getX() > maxX) {
                maxX = p.getX();
            }
            if (p.getY() < minY) {
                minY = p.getY();
            }
            if (p.getY() > maxY) {
                maxY = p.getY();
            }
        }

        double szerokosc = maxX - minX;
        double wysokosc = maxY - minY;

        return new BoundingBox(minX, minY, szerokosc, wysokosc);
    }
}