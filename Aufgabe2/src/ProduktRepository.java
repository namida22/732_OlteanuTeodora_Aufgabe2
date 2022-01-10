import jdk.jshell.spi.SPIResolutionException;

import java.util.ArrayList;
import java.util.Objects;

public class ProduktRepository {

    public static ArrayList<Produkt> produktRepository = new ArrayList<>();

    public ProduktRepository() {
    }

    public static ArrayList<Produkt> getProduktRepository() {
        return produktRepository;
    }

    public static void setProduktRepository(ArrayList<Produkt> produktRepository) {
        ProduktRepository.produktRepository = produktRepository;
    }

    /**
     * add Object Product to repo
     * @param produkt
     */
    public void addProdukt(Produkt produkt)
    {
        produktRepository.add(produkt);
    }

    /**
     * delete Object Product from repo
     * @param produkt
     */
    public void deleteProdukt(Produkt produkt)
    {
        produktRepository.remove(produkt);
    }

    /**
     * update Object Product
     * @param produkt
     */
    public void updateProdukt(Produkt produkt)
    {
        for(Produkt p:produktRepository)
        {
            if(Objects.equals(produkt.getName(), p.getName()))
            {
              p.setInitialleAnzahlProdukteAmLager(produkt.getInitialleAnzahlProdukteAmLager());
              p.setSKU(produkt.getSKU());
              p.setPreis(produkt.getPreis());
            }
        }
    }

    public static void anzeigen()
    {
        for(Produkt produkt: produktRepository)
            System.out.println(produkt);
    }
}
