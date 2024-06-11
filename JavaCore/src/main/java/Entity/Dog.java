package Entity;

public class Dog {
    public String name;
    int age;

    public Dog(String name, int age){
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Entity.Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
