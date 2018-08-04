package jack.integration;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * create by jack on 18-6-21
 */

public class MainApp {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("jack/integration/Beans.xml");
        HelloWorld world = (HelloWorld) context.getBean("helloWorld");
        world.getMessage1();
        world.getMessage2();

        HelloIndia india = (HelloIndia) context.getBean("india");
        india.getMessage1();
        india.getMessage2();
        india.getMessage3();

        Templete templete = (Templete) context.getBean("templete");
        templete.getMessage1();
        templete.getMessage2();
        templete.getMessage3();
    }
}
