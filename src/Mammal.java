public class Mammal extends Animal {
    String name;

    public Mammal(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName()+"{" + name +  '}';
    }
}

