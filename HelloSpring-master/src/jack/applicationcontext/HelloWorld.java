package jack.applicationcontext;

/**
 * create by jack on 18-6-18
 */

public class HelloWorld {
    private String message;

    public void showMessage() {
        System.out.println("The Message:" + message);
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
