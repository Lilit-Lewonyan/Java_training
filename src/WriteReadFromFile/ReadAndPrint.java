package WriteReadFromFile;

import java.io.FileReader;
import java.io.IOException;

public class ReadAndPrint {
    public static String fileLocation ;
    static {
        fileLocation = Write.fileLocation;
    }

    public static void ReadAndPrintFileinformation() throws IOException {
        // pass the path to the file as a parameter
        FileReader fr = new FileReader(fileLocation);

        int i;
        while ((i = fr.read()) != -1)
            System.out.print((char) i);
    }

}
