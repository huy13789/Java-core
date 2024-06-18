import java.io.IOException;

public class TryCatchFinallyDemo {
    public static void main(String[] args) {
        try {
            // ArithmeticException
            int a = 1;
            int b = 0;
            // System.out.println(a / b);

            // NullPointerException
            String s = null;
            // System.out.println(s.length());

            // ArrayIndexOutOfBoundsException
            int[] array = {1, 2, 3};
            // System.out.println(array[100]);

            // Exception
            throw new IOException("Ngoại lệ không xác định");
        } catch (ArithmeticException exception) {
            System.out.println("Không thể chia cho 0");
        } catch (NullPointerException | ArrayIndexOutOfBoundsException exception) {
            System.out.println(exception.getMessage());
        } catch (Exception exception) {
            System.out.println("Đã có lỗi, vui lòng thử lại sau");
        } finally {
            System.out.println("Khối finally luôn được gọi");
        }

        // try catch
        // try finally
        // try catch finally
    }
}