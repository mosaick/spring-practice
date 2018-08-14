package ioc;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Employee implements WorkManager {
    @Override
    public String doIt() {
        return "do employee";
    }

    @PostConstruct
    public void onCreated() {
        System.out.println("employee created");
    }

    @PreDestroy
    public void onDestroyed() {
        System.out.println("employee destroyed");
    }
}
