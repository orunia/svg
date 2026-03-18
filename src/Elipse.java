class Ellipse extends Shape {
    private Point srodek;
    private double promienX;
    private double promienY;

    public Ellipse(Point srodek, double promienX, double promienY, Style styl) {
        super(styl);
        this.srodek = new Point(srodek);
        this.promienX = promienX;
        this.promienY = promienY;
    }

    public String toSvg() {
        return "<ellipse cx=\"" + srodek.getX() + "\" cy=\"" + srodek.getY() +
                "\" rx=\"" + promienX + "\" ry=\"" + promienY + "\" " + styl.toSvg() + " />";
    }
}