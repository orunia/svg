public class Point {
    public double x;
    public double y;

    // Konstruktor bezargumentowy
    public Point() {
        this.x = 0;
        this.y = 0;
    }


    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    // Zadanie 1
    @Override
    public String toString() {
        return "x: " + x + ", y: " + y;
    }

    // Zadanie 2
    public String toSvg() {
        return "<circle r=\"5\" cx=\"" + x + "\" cy=\"" + y + "\" fill=\"red\" />";
    }

    // Zadanie 3 - zmienia aktualny punkt
    public void translate(double dx, double dy) {
        this.x += dx;
        this.y += dy;
    }

    // Zadanie 3 - tworzy nowy przesunięty punkt
    public Point translated(double dx, double dy) {
        return new Point(this.x + dx, this.y + dy);
    }
}