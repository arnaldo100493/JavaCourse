package scanner;

import java.util.Scanner;

public class ScannerDelimeterExample {

    public static void main(String[] args) {
        String text = "I, Am, A, Java, Programmer";
        Scanner in = new Scanner(text).useDelimiter("\\s*,\\s*");
        while (in.hasNextLine()) {
            System.out.println(in.next());
        }

    }

}
