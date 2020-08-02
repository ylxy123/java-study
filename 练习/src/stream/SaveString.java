package stream;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.FileHandler;

public class SaveString {
    public static void main(String[] args) {
        SaveToFile("/home/ylxy/Desktop/Java/1", "play the guitar");
    }

    // 当 TextToFile 函数被调用后，strBuffer 的信息即写入到 strFilename 所指向的文件中。
    public static void SaveToFile(final String fileName, final String strBuffer){
        try {
            File fileText = new File(fileName);
            if (fileText.getParentFile().exists() == false){
                fileText.mkdirs();
                fileText.createNewFile();
            }
            FileWriter fileWriter = new FileWriter(fileText);
            fileWriter.write(strBuffer);
            fileWriter.close();
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }
}
