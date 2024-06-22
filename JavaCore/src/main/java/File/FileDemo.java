package File;

import java.io.IOException;

public class FileDemo {
    public static void main(String[] args) throws IOException {
        //String path = "C:/Users/huy13/OneDrive/Desktop/VTI/JavaCore/JavaCore/src/main/resources";
        String path = "src/main/resources";
        System.out.println(FileManagers.exists(path));
        System.out.println(FileManagers.isFile(path));
        System.out.println(FileManagers.isDirectory(path));
        FileManagers.createNewFile(path + "/abc.txt");
        FileManagers.mkdirs(path + "/database");
        String[] names = FileManagers.list(path);
        for (String name : names) {
            System.out.println("👉 " + name);
        }

        FileManagers.moveTo(
                path + "/abc.txt",
                path + "/database/lesson.sql"
        );

        FileManagers.delete(path + "/database/lesson.sql");
        FileManagers.delete(path + "/database");
        FileManagers.delete(path + "/abc.txt");
    }
}

