public class Student {
    private int age;
    private String name;
    private static int count;

    public Student(String name) {
        if (count >= 2){
            throw new IllegalStateException("So luong nhieu nhat la 2");
        }
        this.age = ++count;
        this.name = name;
    }
    public static int getCount() {
        return count;
    }
}
