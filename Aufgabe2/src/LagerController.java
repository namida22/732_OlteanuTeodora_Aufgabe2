public class LagerController {

    LagerRepository lagerRepository = new LagerRepository();

    /**
     * substract values from product objects the values from Lager array
     * @param lager
     */
    public void substract(Lager lager)
    {
        for(int i =0; i<ProduktRepository.produktRepository.size();i++)
            ProduktRepository.produktRepository.get(i).setInitialleAnzahlProdukteAmLager(
                    ProduktRepository.produktRepository.get(i).getInitialleAnzahlProdukteAmLager()-lager.getAnzahl().get(i)
            );
    }
}
