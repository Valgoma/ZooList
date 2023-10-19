import java.util.ArrayList;
import java.util.Random;

public class Lion extends Mammals{
    public Lion(String name) {
        super(name);
    }
    public ArrayList<Giraffe> ohota (ArrayList<Giraffe> girfs)
    {
        Random ran = new Random();
        int k= ran.nextInt(5);
        girfs.remove(k);
        return girfs;
    }
}
