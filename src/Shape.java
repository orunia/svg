public abstract class Shape {
    protected Style styl;

    public Shape(Style styl) {
        this.styl = styl;
    }

    public abstract String toSvg();
}