public class StaticDemo {


    public static void main(String[] args) {
        try {

            Student student = new Student("Huy");
            Student student2 = new Student("Huy");
            Student student3 = new Student("Huy");
        } catch (IllegalStateException ex){
            System.out.println("ex.getMessage() = " + ex.getMessage());
        }finally {
            System.out.println("So hoc vien " + Student.getCount());
        }
        System.out.println("Math.max(3,2) = " + Math.max(3,2));
    }
}
