package ex2;

public class HelloWorld {
    private static String message;


    public HelloWorld(String message) {
        this.message = message;
    }

    public static String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
