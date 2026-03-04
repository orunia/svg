public class Segment {
    public Point p1;
    public Point p2;

    public Segment(Point p1, Point p2) {
        this.p1 = p1;
        this.p2 = p2;
    }

    // Zadanie 4
    public double length() {
        double dx = p2.x - p1.x;
        double dy = p2.y - p1.y;
        return Math.sqrt(dx * dx + dy * dy);
    }

    // Zadanie 5 (przeniesiona metoda do klasy Segment)
    public static Segment longestSegment(Segment[] segments) {
        if (segments == null || segments.length == 0) {
            return null;
        }

        Segment longest = segments[0];

        for (int i = 1; i < segments.length; i++) {
            if (segments[i].length() > longest.length()) {
                longest = segments[i];
            }
        }

        return longest;
    }
}
