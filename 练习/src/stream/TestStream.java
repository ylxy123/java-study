package stream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class TestStream {
    public static void main(String[] args) {
        // 文件输入流
        String filename = "/home/ylxy/Desktop/Java/java";
        try {
            File f = new File(filename);
            FileInputStream fis = new FileInputStream(f);
            byte[] all = new byte[(int)f.length()];
            fis.read(all);
            for (byte i : all){
                System.out.println(i);
            }
            fis.close();
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }
}
