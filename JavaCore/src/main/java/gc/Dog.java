package gc;

public class Dog {
    private String name;

    public Dog(String name) {
        this.name = name;
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("name thu hoi: = " + name);
    }
}
