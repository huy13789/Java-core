public class ifElseDemo {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;

        if (a > b) {
            System.out.println("max " + a);
        } else if (100 > 10) {
            System.out.println("100 > 10");
        } else {
            System.out.println("max " + b);
        }

        // toán tử ternary
        int max = (a > b) ? a : b; // int max = Math.max(a, b);
        System.out.println("max = " + max);

    }


}
