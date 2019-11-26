package nativemethods;

public class Happy {

    public native void printText();

    static {
        System.loadLibrary("happy");
    }

}
