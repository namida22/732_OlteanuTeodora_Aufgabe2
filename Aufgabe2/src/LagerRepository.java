import java.util.ArrayList;
import java.util.Objects;

public class LagerRepository {
    public static ArrayList<Lager> LagerRepository = new ArrayList<>();

    public LagerRepository() {
    }

    /**
     * add Lager to repo
     * @param lager
     */
    public void addLager(Lager lager)
    {
        LagerRepository.add(lager);
    }
    /**
     * delete Lager from repo
     * @param lager
     */
    public void deleteLager(Lager lager)
    {
        LagerRepository.remove(lager);
    }
    /**
     * update Object Lager
     * @param lager
     */
    public void updateLager(Lager lager)
    {
        for(Lager l: LagerRepository)
        {
            if(Objects.equals(lager.getDatum(), l.getDatum()))
            {
            }
        }
    }
}
