package instantiation;

public class MyClass2 {

    private String message = null;

    // Private helper used by this class

    private void showMessage() {
        if (message == null) {
            message = new String("MyClass2");
        }
        System.out.println(message);
    }

}
