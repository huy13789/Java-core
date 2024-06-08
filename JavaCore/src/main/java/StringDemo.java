public class StringDemo {
    public static void main(String[] args) {
        //Nguyen thuy
        String string = "Java Core";
        String string1 = "Java Core";

        String string2 = new String("Java Core");
        String string3 = new String("Java Core");

        //So sánh
        System.out.println(string == string1);
        System.out.println(string == string2);
        System.out.println(string2 == string3);
    }
}
