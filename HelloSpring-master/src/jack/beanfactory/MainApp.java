package jack.beanfactory;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

/**
 * create by jack on 18-6-18
 */

public class MainApp {
    public static void main(String[] args) {
        // 第一步利用框架提供的 XmlBeanFactory() API 去生成工厂 bean
        // 以及利用 ClassPathResource() API 去加载在路径 CLASSPATH 下可用的 bean 配置文件。
        // XmlBeanFactory() API 负责创建并初始化所有的对象，即在配置文件中提到的 bean。
        XmlBeanFactory factory = new XmlBeanFactory(new ClassPathResource("jack/beanfactory/BeanFactoryBeans.xml"));
        // 第二步利用第一步生成的 bean 工厂对象的 getBean() 方法得到所需要的 bean。
        // 这个方法通过配置文件中的 bean ID 来返回一个真正的对象，该对象最后可以用于实际的对象。
        // 一旦得到这个对象，就可以利用这个对象来调用任何方法。
        HelloWorld helloWorld = (HelloWorld) factory.getBean("helloWorld");
        helloWorld.showMessage();
    }
}
