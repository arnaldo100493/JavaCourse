package zip;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

public class Decrypt {

    public void decrypt() {
        try {
            // Open the ZIP file
            String sourcefile = "sourse.zip";
            ZipInputStream in = new ZipInputStream(new FileInputStream(sourcefile));
            // Get the first entry
            ZipEntry entre = in.getNextEntry();
            // Open the output file
            String targetfile = "target";
            OutputStream out = new FileOutputStream(targetfile);
            // Transfer bytes from the ZIP file to the output file
            byte[] buf = new byte[1024];
            int len;
            while ((len = in.read(buf)) > 0) {
                out.write(buf, 0, len);
            }
            // Close the streams
            out.close();
            in.close();
        } catch (IOException ex) {

        }
    }

}
