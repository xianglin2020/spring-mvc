package jack.lifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * create by jack on 18-6-21
 */

public class MainApp {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("jack/lifecycle/Beans.xml");
        HelloWorld helloWorld = (HelloWorld) context.getBean("helloWorld");
        helloWorld.showMessage();

//        HelloWorldImp imp = (HelloWorldImp)context.getBean("helloWorldImp");
//        imp.showMessage();


        // 你需要注册一个在 AbstractApplicationContext 类中声明的关闭 hook 的 registerShutdownHook() 方法。它将确保正常关闭，并且调用相关的 destroy 方法
        ((ClassPathXmlApplicationContext) context).registerShutdownHook();
    }
}
