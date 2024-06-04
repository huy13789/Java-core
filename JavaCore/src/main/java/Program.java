public class Program {
    public static void main(String[] args) {
        // Toán tử số học

//        System.out.println(99 + 2);
//        System.out.println(99 - 2);
//        System.out.println(99 * 2);
//        System.out.println(99d / 2);
//        System.out.println(99 % 2);


        // Chú ý
        // a = 100;

        //int b = a++; // b = a, b = b + 1;
        //int b = ++a; // b = b + 1, b = a ;
        //System.out.println("a = " + a);
        //System.out.println("b = " + b);

        // Toán tử quan hệ
        // ==, >, >=, <, <=, !=

        // Toán tử logic
        // AND: &&
        // OR: ||
        // NOT: !
        int b = 100;
        int a = 100;

        boolean ok = b > 5 && b < 10;
        System.out.println("ok = " + ok);
        boolean notTrue = !true;
        System.out.println("notTrue = " + notTrue);



        a = (b != a) ? 1 : 2;
        System.out.println("c = " + a);


    }
}
