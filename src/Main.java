public class Main {

    public static void main(String[] args) {

        // Zadanie 1
        Point point = new Point(3, 4);
        System.out.println(point);
        System.out.println(point.x + " " + point.y);

        // Zadanie 2
        System.out.println(point.toSvg());

        // Zadanie 3
        point.translate(2, 3);
        System.out.println("Po translate: " + point);

        Point newPoint = point.translated(-1, -1);
        System.out.println("Nowy punkt (translated): " + newPoint);
        System.out.println("Oryginalny punkt: " + point);

        // Zadanie 4
        Segment s1 = new Segment(new Point(0, 0), new Point(3, 4));
        Segment s2 = new Segment(new Point(0, 0), new Point(6, 8));
        Segment s3 = new Segment(new Point(1, 1), new Point(2, 2));

        System.out.println("Długość s1: " + s1.length());
        System.out.println("Długość s2: " + s2.length());
        System.out.println("Długość s3: " + s3.length());


        Segment[] segments = {s1, s2, s3};
        Segment longest = Segment.longestSegment(segments);

        if (longest != null) {
            System.out.println("Najdłuższy segment ma długość: " + longest.length());
        }
    }
}