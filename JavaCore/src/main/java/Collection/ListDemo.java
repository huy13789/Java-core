package Collection;

import java.util.LinkedList;
import java.util.List;

public class ListDemo {
    public static void main(String[] args) {
        List<String> stringList = new LinkedList<>();

        stringList.add("Huy");
        System.out.println("stringList.toString() = " + stringList.toString());

        stringList.add("Long");
        System.out.println("stringList.toString() = " + stringList.toString());

        stringList.add("Vũ");
        System.out.println("stringList.toString() = " + stringList.toString());

        stringList.add(0, "Đạt");
        System.out.println("stringList.toString() = " + stringList.toString());

        System.out.println(stringList.size());
        // 3

        System.out.println(stringList.isEmpty());
        // false

        System.out.println(stringList.get(0));
        // Đạt

        System.out.println(stringList.indexOf("Đạt"));
        // 0

        System.out.println(stringList.contains("Hà"));
        // false

        stringList.remove(0);
        System.out.println("stringList.toString() = " + stringList.toString());

        stringList.remove("Huy");
        System.out.println("stringList.toString() = " + stringList.toString());

        stringList.clear();
        System.out.println("stringList.toString() = " + stringList.toString());

    }
}
