package Annotation;

import javax.jws.Oneway;

public class Math {
    @Deprecated
    public static int maxV1(int a, int b) {
        if (a > b) {
            return a;
        } else return b;
    }

    @SuppressWarnings("deprecation")
    public static int maxV2(int a, int b) {
        return a > b ? a : b;
    }

    public static int maxV3(int a, int b) {
        return java.lang.Math.max(a, b);
    }
}
