public class Style {
    public final String kolorWypelnienia;
    public final String kolorObrysu;
    public final Double gruboscObrysu;

    public Style(String kolorWypelnienia, String kolorObrysu, Double gruboscObrysu) {
        this.kolorWypelnienia = kolorWypelnienia;
        this.kolorObrysu = kolorObrysu;
        this.gruboscObrysu = gruboscObrysu;
    }

    public String toSvg() {
        return "fill=\"" + kolorWypelnienia + "\" stroke=\"" + kolorObrysu + "\" stroke-width=\"" + gruboscObrysu + "\"";
    }
}