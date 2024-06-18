public class ThrowDemo {
    public static void main(String[] args) {
        int age = 16;

        try {
            if (age < 18) {
                throw new IllegalStateException("Bạn chưa đủ 18 tuổi");
            } else {
                System.out.println("Chào mừng bạn...");
            }
        } catch (IllegalStateException exception) {
            System.out.println(exception.getMessage());
        }
    }
}