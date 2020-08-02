package file;

import java.io.FileOutputStream;
import java.io.File;
import java.io.IOException;

public class SaveFile {
    public static void main(String[] args) {
        try {
            File f = new File("/home/ylxy/Desktop/Java/1/1/1");
            if (f.getParentFile().exists() == false){
                f.getParentFile().mkdirs();
                f.createNewFile();
            }
            byte data[] = {88, 89};
            FileOutputStream fos = new FileOutputStream(f);
            fos.write(data);
            fos.close();
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }
}
