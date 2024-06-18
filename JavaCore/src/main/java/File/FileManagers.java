package File;

import java.io.File;
import java.io.IOException;

public class FileManagers {
    public static boolean createNewFile(String path) throws IOException {
        File file = new File(path);
        File parentDir = file.getParentFile();
        // Create the directory structure if it does not exist
        if (parentDir != null && !parentDir.exists()) {
            parentDir.mkdirs();
        }

        return file.createNewFile();
    }
}
