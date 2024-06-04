public class OutPutDemo {
    public static void main(String[] args) {
        // Escape characters
        //  \" -> "
        //  \' -> '
        //  \\ -> \
        //  \n- > xuống dòng
        //  \t -> tab

        //System.out.printf
        // %s : string
        // %d : decimal
        // %f ; floating point
        // %c : đại diện cho kí tự điếm đc / sign couted
        // %n or /n : đại diện xuống dòng
        System.out.printf("Họ tên: %s, tuổi : %d. %n", "Huy", 20);

        // Căn lề
        System.out.println("+----+--------------------+");
        System.out.println("| ID |     FULL NAME      |");
        System.out.println("+----+--------------------+");
        System.out.printf("| %2d | %18s |%n", 1, "Khoa");
        System.out.println("+----+--------------------+");
        System.out.printf("| %-2d | %-18s |%n", 2, "Long");

        double money  = 1243565789.123;
        System.out.printf("money = %.2f%n", money);
        System.out.printf("money = %,2f%n", money);
        System.out.printf("money = %,.2f%n", money);
    }
}
