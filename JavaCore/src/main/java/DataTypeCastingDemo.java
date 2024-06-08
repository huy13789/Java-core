public class DataTypeCastingDemo {
    public static void main(String[] args) {
        //Widening
        // byte 1bit -> short 2bit -> int 4bit -> long 8bit -> float 4bit -> double 8bit
        byte a = 10;
        int b = a;
        System.out.println("b = " + b);
        System.out.println("a = " + a);

        //Narrowing
        // Ngược lại

        // Chú ý
        int x = 1;
        int y = 2;
        float z = (float)x/y;
        System.out.println("z = " + z);
    }
}
