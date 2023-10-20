import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Seal> seals = collectSeals(3);
        ArrayList<Lion> lions = collectLions(2);
        ArrayList<Giraffe> girfs = collectGirfs(5);
        for (Lion l: lions) {
            l.ohota(girfs);
        }
        var mammals = merge(seals,lions,girfs); //автоматический выбор типа для ссылочной переменной
        System.out.println(mammals);
    }

        private static ArrayList<Seal> collectSeals(int n) {
            ArrayList<Seal> seals = new ArrayList<>();
            for (int i=0; i<n; i++)
                {
                Seal s = new Seal("Котик"+i);
                    seals.add(s);
                }

            return seals;
        }
    private static ArrayList<Lion> collectLions(int n) {
        ArrayList<Lion> lions = new ArrayList<>();
        for (int i=0; i<n; i++)
        {
            Lion l = new Lion("Лев"+i);
            lions.add(l);
        }

        return lions;
    }
    private static ArrayList<Giraffe> collectGirfs(int n) {
        ArrayList<Giraffe> girfs = new ArrayList<>();
        for (int i=0; i<n; i++)
        {
            Giraffe g = new Giraffe("Жираф"+i);
            girfs.add(g);
        }

        return girfs;
    }
    public static ArrayList<Mammal> merge(ArrayList<Seal> seals, ArrayList<Lion> lions, ArrayList<Giraffe> girfs)
    {
        ArrayList<Mammal> list = new ArrayList<>();

        list.addAll(seals);
        list.addAll(lions);
        list.addAll(girfs);

        return list;
    }
}