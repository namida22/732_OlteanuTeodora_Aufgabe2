import java.time.Instant;
import java.time.LocalDate;
import java.util.ArrayList;

public class LagerView {
    LagerController lagerController = new LagerController();

    public void menu()
    {
        aufrufen();
        ProduktRepository.anzeigen();
    }

    /**
     * create data objects Lager und Product
     */
    public void aufrufen()
    {
        Produkt p1 = new Produkt("n1",12,"SKU1",15);
        Produkt p2 = new Produkt("n2",13,"SKU2",10);
        Produkt p3 = new Produkt("n3",12,"SKU3",5);

        ProduktRepository.produktRepository.add(p1);
        ProduktRepository.produktRepository.add(p2);
        ProduktRepository.produktRepository.add(p3);

        LocalDate date = LocalDate.now();
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(5);
        arrayList.add(10);
        arrayList.add(3);
        Lager lager = new Lager(date,ProduktRepository.produktRepository, arrayList);

        lagerController.substract(lager);
    }


}
