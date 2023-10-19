import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ArrayList<Seal> seals = collectSeals();
        ArrayList<Lion> lions = collectLions();
        ArrayList<Giraffe> girfs = collectGirfs();
        for (Lion l: lions) {
            l.ohota(girfs);
        }
        merge(seals,lions,girfs);
        System.out.println(merge(seals,lions,girfs));

    }
        private static ArrayList<Seal> collectSeals() {
            ArrayList<Seal> seals = new ArrayList<>();
            for (int i=0; i<3; i++)
                {
                Seal s = new Seal("Котик"+i);
                    seals.add(s);
                }

            return seals;
        }
    private static ArrayList<Lion> collectLions() {
        ArrayList<Lion> lions = new ArrayList<>();
        for (int i=0; i<2; i++)
        {
            Lion l = new Lion("Лев"+i);
            lions.add(l);
        }

        return lions;
    }
    private static ArrayList<Giraffe> collectGirfs() {
        ArrayList<Giraffe> girfs = new ArrayList<>();
        for (int i=0; i<5; i++)
        {
            Giraffe g = new Giraffe("Жираф"+i);
            girfs.add(g);
        }

        return girfs;
    }
    public static ArrayList<Object> merge(ArrayList<Seal> seals, ArrayList<Lion> lions, ArrayList<Giraffe> girfs)
    {
        ArrayList<Object> list = new ArrayList<>();

        list.addAll(seals);
        list.addAll(lions);
        list.addAll(girfs);

        return list;
    }
}