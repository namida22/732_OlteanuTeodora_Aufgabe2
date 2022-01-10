import java.time.LocalDate;
import java.util.ArrayList;

public class Lager {

    private LocalDate datum;
    private ArrayList<Produkt> produkts;
    private int anzahl;

    public Lager(LocalDate datum, ArrayList<Produkt> produkts) {
        this.datum = datum;
        this.produkts = produkts;
    }

    public LocalDate getDatum() {
        return datum;
    }

    public void setDatum(LocalDate datum) {
        this.datum = datum;
    }

    public ArrayList<Produkt> getProdukts() {
        return produkts;
    }

    public void setProdukts(ArrayList<Produkt> produkts) {
        this.produkts = produkts;
    }

    public int getAnzahl() {
        return anzahl;
    }

    public void setAnzahl(int anzahl) {
        this.anzahl = anzahl;
    }
}
