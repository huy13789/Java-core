package inherritance;

public class Duck extends Animals{
    public Duck(String name, int ade) {
        super(name, ade);
    }

    @Override
    void eat() {
        super.eat();
        System.out.println("hihi");
    }
}
