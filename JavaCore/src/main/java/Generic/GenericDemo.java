package Generic;

public class GenericDemo {
    public static void main(String[] args) {
        // LAP TRINH TONG QUAT

        //Quy Ước
        // T - Type
        // E - Element / Entity
        // N - Number
        // K - key
        // V - Value

        // generic class / interface

        Dog<Integer> dog1 = new Dog<>("Đạt", 1);
        System.out.println(dog1);
        Dog<Double> dog2 = new Dog<>("Hà", 2.5);
        System.out.println(dog2);

        // bounded type
//        Dog<String> dog3 = new Dog<>("Name", "Aabc");
//        System.out.println(dog3);
        // multiple bounds
        int max = Math.max(1, 100);
        System.out.println("max = " + max);

        // generic method
        Printer.printAny(3);
        Printer.printAny(5);
        Printer.printAny("Huy");

        //Wildcard


    }
}
