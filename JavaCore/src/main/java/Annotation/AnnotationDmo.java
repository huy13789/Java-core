package Annotation;

public class AnnotationDmo {
    public static void main(String[] args) {
        // Cú pháp: @ + Tên
        // 1 thêm thong tin cho compaiter
        // 2 them chuc nang tuy cho tung chuc nang

        //Override
        AnnotationDmo demo = new AnnotationDmo();
        System.out.println("demo = " + demo);

        //Deprecated
        int max = Math.maxV2(1,2);
        System.out.println("max = " + max);
    }

    @Override
    public String toString() {
        return "This is AnnotationDemo Class";
    }
}
