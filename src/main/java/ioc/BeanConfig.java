package ioc;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import(value = {CompanyConfig.class})      // import 로 config추가시 intellij에서 bean id 자동완성이 안되네.
public class BeanConfig {
    @Bean
    public WorkManager boss() {
        return new Boss();
    }

    @Bean
    public WorkManager employee() {
        return new Employee();
    }

    @Bean
    public WorkService myWorkService() {
        WorkService myWorkService = new WorkService();
        myWorkService.setWorkManager(boss());
        return myWorkService;
    }

    @Bean
    public WorkService yourWorkService() {
        WorkService yourWorkService = new WorkService();
        yourWorkService.setWorkManager(employee());
        return yourWorkService;
    }
}
