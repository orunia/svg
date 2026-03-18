import java.io.FileWriter;
import java.io.IOException;

public class SvgScene {
    private Shape[] ksztalty;

    public SvgScene(Shape[] ksztalty) {
        this.ksztalty = ksztalty;
    }

    public String toSvg() {
        String wynik = "<svg xmlns=\"http://www.w3.org/2000/svg\">";
        for (Shape k : ksztalty) {
            wynik += k.toSvg();
        }
        wynik += "</svg>";
        return wynik;
    }

    public void save(String sciezka) {
        double minX = Double.MAX_VALUE;
        double minY = Double.MAX_VALUE;
        double maxX = -Double.MAX_VALUE;
        double maxY = -Double.MAX_VALUE;

        for (Shape k : ksztalty) {
            if (k instanceof Polygon) {
                Polygon p = (Polygon) k;
                BoundingBox b = p.boundingBox();

                if (b.x() < minX) {
                    minX = b.x();
                }
                if (b.y() < minY) {
                    minY = b.y();
                }
                if (b.x() + b.szerokosc() > maxX) {
                    maxX = b.x() + b.szerokosc();
                }
                if (b.y() + b.wysokosc() > maxY) {
                    maxY = b.y() + b.wysokosc();
                }
            }
        }

        double szerokosc = maxX - minX;
        double wysokosc = maxY - minY;

        String svg = "<svg xmlns=\"http://www.w3.org/2000/svg\" width=\"" + szerokosc +
                "\" height=\"" + wysokosc + "\" viewBox=\"" + minX + " " + minY + " " +
                szerokosc + " " + wysokosc + "\">";

        for (Shape k : ksztalty) {
            svg += k.toSvg();
        }

        svg += "</svg>";

        try {
            FileWriter fw = new FileWriter(sciezka);
            fw.write(svg);
            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}