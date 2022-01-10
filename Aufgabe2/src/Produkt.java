public class Produkt {
    private String name;
    private float preis;
    private String SKU;
    private int initialleAnzahlProdukteAmLager;

    public Produkt(String name, float preis, String SKU, int initialleAnzahlProdukteAmLager) {
        this.name = name;
        this.preis = preis;
        this.SKU = SKU;
        this.initialleAnzahlProdukteAmLager = initialleAnzahlProdukteAmLager;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPreis() {
        return preis;
    }

    public void setPreis(float preis) {
        this.preis = preis;
    }

    public String getSKU() {
        return SKU;
    }

    public void setSKU(String SKU) {
        this.SKU = SKU;
    }

    public int getInitialleAnzahlProdukteAmLager() {
        return initialleAnzahlProdukteAmLager;
    }

    public void setInitialleAnzahlProdukteAmLager(int initialleAnzahlProdukteAmLager) {
        this.initialleAnzahlProdukteAmLager = initialleAnzahlProdukteAmLager;
    }

    @Override
    public String toString() {
        return "Produkt{" +
                "name='" + name + '\'' +
                ", preis=" + preis +
                ", SKU='" + SKU + '\'' +
                ", initialleAnzahlProdukteAmLager=" + initialleAnzahlProdukteAmLager +
                '}';
    }
}
