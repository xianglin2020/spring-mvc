package jack.lifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

/**
 * create by jack on 18-6-21
 */

public class HelloWorldImp implements DisposableBean, InitializingBean {
    @Override
    public void destroy() throws Exception {
        System.out.println("使用 org.springframework.beans.factory.DisposableBean 接口 销毁");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("使用org.springframework.beans.factory.InitializingBean 接口 初始化");
    }

    private String message;

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
