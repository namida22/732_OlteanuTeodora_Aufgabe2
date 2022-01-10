import java.time.Instant;
import java.time.LocalDate;
import java.util.ArrayList;

public class Lager {

    private LocalDate datum;
    private ArrayList<Produkt> produkts;
    private ArrayList<Integer> anzahl;

    public Lager(LocalDate datum, ArrayList<Produkt> produkts, ArrayList<Integer> anzahl) {
        this.datum = datum;
        this.produkts = produkts;
        this.anzahl = anzahl;
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

    public ArrayList<Integer> getAnzahl() {
        return anzahl;
    }

    public void setAnzahl(ArrayList<Integer> anzahl) {
        this.anzahl = anzahl;
    }
}
