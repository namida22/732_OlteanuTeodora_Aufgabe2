import java.util.ArrayList;
import java.util.Objects;

public class LagerRepository {
    public static ArrayList<Lager> LagerRepository = new ArrayList<>();

    public LagerRepository() {
    }

    public void addLager(Lager lager)
    {
        LagerRepository.add(lager);
    }

    public void deleteLager(Lager lager)
    {
        LagerRepository.remove(lager);
    }

}
