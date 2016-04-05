package zadanie1;

/**
 * Created by SKROLI15 on 2016-04-04.
 */
public abstract class Flower {
    private int x;
    private String kolor;
    private String imie;
    private PriceList cena;

    public Flower(int y, String a, String color) {
        x = y;
        imie = a;
        cena = PriceList.getInstance();
        kolor = color;
    }

    public String kolor() {
        return kolor;
    }
    public String imie() {
        return imie;
    }

    public int ilosc() {
        return x;
    }

    public PriceList price() {
        return cena;
    }


    public String toString() {
        Integer price = price().get(imie());
        if (price == null) price = -1;

        return imie() + ", kolor: " + kolor() +
                ", ilość " + ilosc() +
                ", cena " + price;
    }
}
