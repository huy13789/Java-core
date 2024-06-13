package polymophism;

public class Polymophism {
    //Tinh da hinh
    public static void main(String[] args) {
        // Student -> Person
        Student student = new Student("Huy", 20);
        student.run();
        Person person = student;
        person.run();
    }
}
