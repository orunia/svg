public class Point {
    public double x=6, y=5;

    public String toString(){
        String napis = "x: " + this.x + ", y: " + y;
        return napis;
    }

    public String toSvg(){
        String napis = "<circle r=\"45\" cx=\""+x+"\" cy=\""+y+"\" fill=\"red\" />";
        return napis;
    }
}
