public class ObjectMethodDemo {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.name = "Milk";
        dog.age = 0;
        System.out.println("dog = " + dog.toString());

        Dog dog1 = new Dog();
        dog1.name = "Long";
        dog1.age = 0;

        Dog dog2 = new Dog();
        dog2.name = "Long";
        dog2.age = 1;

        System.out.println(dog1.equals(dog2));
    }
}
