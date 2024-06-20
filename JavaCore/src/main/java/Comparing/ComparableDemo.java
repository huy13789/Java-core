package Comparing;

import java.util.*;

public class ComparableDemo {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student(1, "Huy"));
        students.add(new Student(5, "Nam"));
        students.add(new Student(4, "Huỳnh"));
        students.add(new Student(2, "Long"));
        students.add(new Student(3, "Khánh"));

        System.out.println("students = " + students);

        Collections.sort(students);
        for (Student student : students){
            System.out.println("student = " + student);
        }

        System.out.println("students = " + students);

        Iterator<Student> iterator = students.iterator();
        while (iterator.hasNext()){
            Student student = iterator.next();
            System.out.println("student = " + student);
        }


    }
}
