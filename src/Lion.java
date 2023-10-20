import java.util.ArrayList;
import java.util.Random;

public class Lion extends Mammal {
    public Lion(String name) {
        super(name);
    }
    public void ohota (ArrayList<Giraffe> girfs)
    {
        Random ran = new Random();
        int k= ran.nextInt(girfs.size());
        System.out.println("пойман жираф "+girfs.get(k));
        girfs.remove(k);
        //return girfs;
    }
}
