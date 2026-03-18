public class Segment {
    private Point punkt1;
    private Point punkt2;

    public Segment(Point punkt1, Point punkt2) {
        this.punkt1 = new Point(punkt1);
        this.punkt2 = new Point(punkt2);
    }

    public Point getPunkt1() {
        return new Point(punkt1);
    }

    public Point getPunkt2() {
        return new Point(punkt2);
    }

    public double length() {
        double dx = punkt2.getX() - punkt1.getX();
        double dy = punkt2.getY() - punkt1.getY();
        return Math.sqrt(dx * dx + dy * dy);
    }

    public Segment perpendicular() {
        double srodekX = (punkt1.getX() + punkt2.getX()) / 2;
        double srodekY = (punkt1.getY() + punkt2.getY()) / 2;

        double dx = punkt2.getX() - punkt1.getX();
        double dy = punkt2.getY() - punkt1.getY();

        double polowaDx = -dy / 2;
        double polowaDy = dx / 2;

        Point p1 = new Point(srodekX + polowaDx, srodekY + polowaDy);
        Point p2 = new Point(srodekX - polowaDx, srodekY - polowaDy);

        return new Segment(p1, p2);
    }

    public String toString() {
        return "Segment: " + punkt1 + " -> " + punkt2;
    }
}