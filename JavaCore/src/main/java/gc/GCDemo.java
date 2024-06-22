package gc;

public class GCDemo {
    public static void main(String[] args) {

        Dog dog = new Dog("A");
        Dog dog1 = new Dog("A");
        dog1 = null;
        System.gc();
        demo();
        System.gc();

    }

    public static void demo() {
        Dog dog = new Dog("B");
    }
}
