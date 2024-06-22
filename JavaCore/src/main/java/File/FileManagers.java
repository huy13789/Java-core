package File;

import java.io.File;
import java.io.IOException;

public class FileManagers {
    public static boolean createNewFile(String path) throws IOException {
        File file = new File(path);
        return file.createNewFile();
    }

    public static boolean exists(String path) {
        File file = new File(path);
        return file.exists();
    }

    public static boolean isFile(String path) {
        File file = new File(path);
        return file.isFile();
    }

    public static boolean isDirectory(String path) {
        File file = new File(path);
        return file.isDirectory();
    }

    public static String[] list(String path) {
        File file = new File(path);
        return file.list();
    }

    public static boolean delete(String path) {
        File file = new File(path);
        return file.delete();
    }

    public static boolean mkdirs(String path) {
        File file = new File(path);
        return file.mkdirs();
    }

    public static boolean moveTo(String source, String destination) {
        File from = new File(source);
        File to = new File(destination);
        return from.renameTo(to);
    }
}
