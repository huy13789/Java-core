import java.io.IOException;

public class ThrowsDemo {
    public static void main(String[] args) {
        try {
            String content = readFile();
            System.out.println(content);
        } catch (IOException exception) {
            System.out.println(exception.getMessage());
        }
    }

    public static String readFile() throws IOException {
        throw new IOException("File không tồn tại");
    }
}