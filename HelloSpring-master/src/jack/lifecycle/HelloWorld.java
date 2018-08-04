package jack.lifecycle;

/**
 * create by jack on 18-6-21
 */

public class HelloWorld {
    private String message;

    private void init() {
        System.out.println("初始化...");
    }

    private void destroy() {
        System.out.println("销毁...");
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void showMessage() {
        System.out.println("The Message:" + message);
    }
}
