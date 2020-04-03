package IO;

import java.io.File;

public class FileTest {
    public static void main(String[] args) {
//        File f = new File("C:\\Windows\\notepad.exe");
//        System.out.println(f);

//        File f = new File("..");
//        System.out.println(f.getPath());
//        System.out.println(f.getAbsolutePath());
//        System.out.println(f.getCanonicalPath());

//        File f1 = new File("C:\\Windows");
//        File f2 = new File("C:\\Windows\\notepad.exe");
//        File f3 = new File("C:\\Windows\\nothing");
//        System.out.println(f1.isFile());
//        System.out.println(f1.isDirectory());
//        System.out.println(f2.isFile());
//        System.out.println(f2.isDirectory());
//        System.out.println(f3.isFile());
//        System.out.println(f3.isDirectory());

        File f = new File("C:\\Windows");
        File[] fs1 = f.listFiles(); // 列出所有文件和子目录
        printFiles(fs1);
        // 仅列出.exe文件
        File[] fs2 = f.listFiles((dir, name) -> {
            return name.endsWith(".exe"); // 返回true表示接受该文件
        });
        printFiles(fs2);
    }

    static void printFiles(File[] files) {
        System.out.println("==========");
        if (files != null) {
            for (File f : files) {
                System.out.println(f);
            }
        }
        System.out.println("==========");
    }
}
