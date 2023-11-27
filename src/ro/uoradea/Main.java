package ro.uoradea;
import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.io.*;

public class Main {

    public static void main(String[] args) {

        String pathname = Path.of("").toAbsolutePath().toString() + "\\Files\\file.txt";
        File file = new File(pathname);
        boolean result;
        try
        {
            result = file.createNewFile();
            if(result)
            {
                System.out.println("file created "+file.getCanonicalPath());
            }
            else
            {
                System.out.println("File already exist at location: "+file.getCanonicalPath());
            }
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }


    }
}
