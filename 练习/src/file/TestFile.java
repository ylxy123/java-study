package file;

import java.io.File;

public class TestFile {
    public static void main(String[] args) {
        // 絕對路徑
        File f1 = new File("/home");
        System.out.println("f1的絕對路徑 : " + f1.getAbsolutePath());
        // 相對路徑, 相對於工作目錄
        File f2 = new File("11");
        System.out.println("f2的絕對路徑：" + f2.getAbsolutePath());

        // 以f1爲父目錄
        File f3 = new File(f1, "11");
        System.out.println("f3的絕對路徑：" + f3.getAbsoluteFile());

    }
}
