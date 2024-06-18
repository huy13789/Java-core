package File;

import java.io.IOException;

public class FileDemo {
    public static void main(String[] args) throws IOException {
        String path = "src/main/resources/abc.txt";
        FileManagers.createNewFile(path);
    }
}

