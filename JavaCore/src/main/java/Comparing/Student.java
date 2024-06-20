package Comparing;

public class Student implements Comparable<Student> {
    private int id;
    private String name;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public int compareTo(Student that) {
        // Tu be toi lon
        if (id > that.id) return 1;
        if (id < that.id) return -1;
        // tu lon toi be
//        if (id > that.id) return -1;
//        if (id < that.id) return 1;

        // cach khac

        // ASC
        //return Integer.compare(id , this.id);
        //DSC
        //return Integer.compare(this.id , id);

        // so sanh kem tieu chi phu
//        int c1 = Integer.compare(id , that.id);
//        if (c1 == 0 ){
//            return that.name.compareTo(name);
//        }
        //return c1 == 0 ? that.name.compareTo(name) : c1;


        return 0;
    }
}
