package Collection;

import java.util.HashSet;
import java.util.Set;

public class SetDemo {
    public static void main(String[] args) {
        // Tuong tu List, chi khac la phan tu khac nhau
        Set<Integer> set = new HashSet<>();

        if (set.add(1) == true) {
            System.out.println("Them thanh cong");
        } else {
            System.out.println("Strung phan tu");
        }
        set.add(1);
        set.add(1);
        set.add(3);
        set.add(5);

        System.out.println("set = " + set);
    }
}
