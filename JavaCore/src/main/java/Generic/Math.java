package Generic;

public class Math {
    public static <T extends Number & Comparable<T>> T max(T a, T b) {
        return a.compareTo(b) >= 0 ? a : b;
    }
}
