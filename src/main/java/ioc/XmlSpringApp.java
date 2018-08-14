package ioc;

import org.springframework.context.support.GenericXmlApplicationContext;

public class XmlSpringApp {
    public static void main(String[] args) {
        GenericXmlApplicationContext context = new GenericXmlApplicationContext("classpath:ioc-applicationContext.xml");

        WorkService myService = context.getBean("myWorkService", WorkService.class);
        WorkService yourService = context.getBean("yourWorkService", WorkService.class);
        myService.askWork();
        yourService.askWork();

        context.close();
    }
}
