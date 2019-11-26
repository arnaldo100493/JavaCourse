package scanner;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class JavaScannerExample {

    // Java Scanner Class Example  

    public static void main(String[] args) throws FileNotFoundException {
        // Creating File Object
        File file = new File("read.txt");
        // Creating Scanner Object
        Scanner scnr = new Scanner(file);
        // Reading each line of file using Scanner class
        int lineNum = 1;
        while (scnr.hasNextLine()) {
            String line = scnr.nextLine();
            System.out.println(lineNum + " : " + line);
            lineNum++;
        }

    }

}
