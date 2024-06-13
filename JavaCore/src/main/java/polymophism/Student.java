package polymophism;

public class Student extends Person {

    public Student(String name, int age) {
        super(name, age);
    }

    @Override
    void run() {
        System.out.println("Student is running ---");
    }
}
