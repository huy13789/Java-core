package IOStream;

import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class IOStreamDemo {


    public static void main(String[] args) throws IOException {
        String path = "C:/Users/huy13/OneDrive/Desktop/VTI/JavaCore/JavaCore/src/main/resources/abc.txt";

        byte[] bytes = "Java core \n".getBytes(StandardCharsets.UTF_8);
        IOManager.writeFile(path, bytes, true);
        IOManager.writeFile(path, bytes, true);
        IOManager.writeFile(path, bytes, true);

        byte[] output = IOManager.readFile(path);
        String content = new String(output);
        System.out.println("content = \n" + content);
    }

}
