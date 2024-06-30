package recursion;

import java.io.File;

public class Test {
    public static void showFiles (File directory) {
        File[] files = directory.listFiles();
        if (files == null) return;
        for (File file : files) {
            if (file.isDirectory()) {
                showFiles(file);
            } else {
                System.out.println(file.getAbsolutePath() + "\\" + file.getName());
            }
        }
    }

    public static void main(String[] args) {
        showFiles(new File("D:\\"));
    }
}
