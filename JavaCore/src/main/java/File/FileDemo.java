package File;

import java.io.IOException;

public class FileDemo {
    public static void main(String[] args) throws IOException {
        String path = "C:/Users/huy13/OneDrive/Desktop/VTI/JavaCore/JavaCore/src/main/resources/abc.txt";
        FileManagers.createNewFile(path);
    }
}

