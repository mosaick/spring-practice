package ioc;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class JavaConfigSpringApp {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.register(BeanConfig.class);
        context.refresh();

        WorkService myWorkService = context.getBean("myWorkService", WorkService.class);
        WorkService yourWorkService = context.getBean("yourWorkService", WorkService.class);
        myWorkService.askWork();
        yourWorkService.askWork();

        Company company = context.getBean("company", Company.class);
        company.getName();

        context.close();
    }
}
