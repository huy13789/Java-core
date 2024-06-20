package IOStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class IOManager {
    public static void writeFile(String path, byte[] bytes, boolean append) {
        try (
                FileOutputStream fos = new FileOutputStream(path, append);
        ) {
            fos.write(bytes);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static byte[] readFile(String path) throws IOException {
        try (FileInputStream fis = new FileInputStream(path)){
            byte[] bytes = new byte[fis.available()];
            fis.read(bytes);
            return bytes;
        }catch (IOException e){
            System.out.println("e = " + e);
            return null;
        }
    }
}
