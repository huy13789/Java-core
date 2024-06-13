package polymophism;

public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void run(){
        System.out.println("Person running");
    }
}
