public class Main {
    public static void main(String[] args) {

        Point p1 = new Point(3, 4);
        Point p2 = new Point(6, 8);
        Point p3 = new Point(1, 2);

        System.out.println("Punkt p1: " + p1);
        System.out.println("SVG p1: " + p1.toSvg());

        p1.translate(1, 1);
        System.out.println("p1 po przesunięciu: " + p1);

        Point p4 = p2.translated(-2, -3);
        System.out.println("Nowy punkt p4: " + p4);
        System.out.println("Oryginalny p2: " + p2);

        Segment s1 = new Segment(p1, p2);
        Segment s2 = new Segment(p2, p3);

        System.out.println("Segment s1: " + s1);
        System.out.println("Długość s1: " + s1.length());

        System.out.println("Segment s2: " + s2);
        System.out.println("Długość s2: " + s2.length());

        Point[] punkty = {p1, p2, p3};
        Polygon wielokat = new Polygon(punkty);

        System.out.println(wielokat);
        System.out.println("SVG wielokąta: " + wielokat.toSvg());
    }
}