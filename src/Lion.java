import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Lion extends Mammal {
    public Lion(String name) {
        super(name);
    }
    public void ohota (ArrayList<Giraffe> girfs)
    {
        Random ran = new Random();
        int k= ran.nextInt(girfs.size());
        System.out.println(name+": пойман жираф "+girfs.get(k));
        girfs.remove(k);
        //return girfs;
    }

    public void giveName()
    {
        System.out.println("муррр-мурр!");
        Scanner scanner = new Scanner(System.in);
        this.name = scanner.nextLine();
    }
}
